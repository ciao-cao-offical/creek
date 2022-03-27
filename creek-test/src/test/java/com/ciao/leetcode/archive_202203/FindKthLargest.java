package com.ciao.leetcode.archive_202203;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/24 0024
 * @description https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(new FindKthLargest().findKthLargest(nums, k));
    }

    //优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            pq.add(num);
        }

        int ans = -1;
        for (int i = 0; i < k; i++) {
            if (!pq.isEmpty()) {
                ans = pq.poll();

            } else {
                return -1;
            }
        }

        return ans;
    }
}
