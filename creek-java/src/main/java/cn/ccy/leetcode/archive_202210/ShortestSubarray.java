package cn.ccy.leetcode.archive_202210;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/26 0026
 * @description https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/
 */
public class ShortestSubarray {
    public static void main(String[] args) {
        int[] nums = {2, -1, 2};
        int k = 3;
        System.out.println(new ShortestSubarray().shortestSubarray(nums, k));
    }

    //cvd，【前缀和 + 单调双端队列】
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] preSumArr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            preSumArr[i + 1] = preSumArr[i] + nums[i];
        }
        int res = n + 1;
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i <= n; i++) {
            long curSum = preSumArr[i];
            while (!queue.isEmpty() && curSum - preSumArr[queue.peekFirst()] >= k) {
                res = Math.min(res, i - queue.pollFirst());
            }
            while (!queue.isEmpty() && preSumArr[queue.peekLast()] >= curSum) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }
        return res < n + 1 ? res : -1;
    }

    //超时...
    /*public int shortestSubarray(int[] nums, int k) {
        int minLen = -1;
        int left = 0;
        int len = nums.length;
        while (left < len) {
            if (nums[left] >= k) {
                return 1;
            }
            int right = left + 1;
            int sum = nums[left];
            for (; right < len; right++) {
                sum += nums[right];
                if (sum >= k) {
                    if (minLen < 0) {
                        minLen = right - left + 1;

                    } else {
                        minLen = Math.min(minLen, right - left + 1);
                    }
                    break;
                }
            }

            left++;
        }

        return minLen;
    }*/

}
