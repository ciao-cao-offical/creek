package com.ciao.leetcode.archive_202301;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/7 0007 17:51:15
 * @description https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/
 */
public class MinOperations {
    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 3};
        int x = 5;
        System.out.println(new MinOperations().minOperations(nums, x));
    }

    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();

        if (sum < x) {
            return -1;
        }

        int right = 0;
        int lsum = 0, rsum = sum;
        int ans = n + 1;

        for (int left = -1; left < n; ++left) {
            if (left != -1) {
                lsum += nums[left];
            }
            while (right < n && lsum + rsum > x) {
                rsum -= nums[right];
                ++right;
            }
            if (lsum + rsum == x) {
                ans = Math.min(ans, (left + 1) + (n - right));
            }
        }

        return ans > n ? -1 : ans;
    }
}
