package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description https://leetcode-cn.com/problems/house-robber-ii/
 */
public class Rob2 {
    public static void main(String[] args) {
        System.out.println(new Rob2().rob(new int[]{1, 2, 3, 1}));
    }

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, len - 2), robRange(nums, 1, len - 1));
    }

    private int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(nums[i] + first, second);
            first = temp;
        }
        return second;
    }
}
