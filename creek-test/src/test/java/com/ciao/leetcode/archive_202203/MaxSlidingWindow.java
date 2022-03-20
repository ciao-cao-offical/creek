package com.ciao.leetcode.archive_202203;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/19 0019
 * @description https://leetcode-cn.com/problems/sliding-window-maximum/
 * ★★★ 试一下【单调队列】和【分块 + 预处理】
 */
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(new MaxSlidingWindow().maxSlidingWindow(nums, k)));
    }

    //大根堆
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] != o1[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });

        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        ans[0] = pq.isEmpty() ? -1 : pq.peek()[0];
        for (int i = k; i < len; i++) {
            pq.offer(new int[]{nums[i], i});
            while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                pq.poll();
            }

            ans[i - k + 1] = pq.isEmpty() ? -1 : pq.peek()[0];
        }
        return ans;
    }
}
