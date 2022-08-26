package com.ciao.leetcode.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/26
 * @description https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/
 */
public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        System.out.println(new MaxProduct().maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int mr = (nums[i] - 1) * (nums[j] - 1);
                res = Math.max(res, mr);
            }
        }
        return res;
    }
}
