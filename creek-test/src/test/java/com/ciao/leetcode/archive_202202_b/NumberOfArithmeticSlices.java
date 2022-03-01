package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/arithmetic-slices/
 */
public class NumberOfArithmeticSlices {
    public static void main(String[] args) {
        System.out.println(new NumberOfArithmeticSlices().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len <= 2) {
            return 0;
        }

        int ans = 0, d = nums[0] - nums[1], t = 0;
        for (int i = 2; i < len; i++) {
            if (nums[i - 1] - nums[i] == d) {
                t++;

            } else {
                d = nums[i - 1] - nums[i];
                t = 0;
            }

            ans += t;
        }

        return ans;
    }
}
