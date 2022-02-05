package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/27
 * @description https://leetcode-cn.com/problems/house-robber/solution/da-jia-jie-she-by-leetcode-solution/
 */
public class Rob {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(nums[i] + first, second);
            first = temp;
        }

        return second;
    }
}
