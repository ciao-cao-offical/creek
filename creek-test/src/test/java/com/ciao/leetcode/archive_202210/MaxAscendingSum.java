package com.ciao.leetcode.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/7 0007
 * @description https://leetcode.cn/problems/maximum-ascending-subarray-sum/
 */
public class MaxAscendingSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(new MaxAscendingSum().maxAscendingSum(nums));
    }

    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            max = Math.max(sum, max);
        }

        return max;
    }
}
