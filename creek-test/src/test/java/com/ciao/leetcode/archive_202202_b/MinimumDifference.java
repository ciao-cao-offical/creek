package com.ciao.leetcode.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */
public class MinimumDifference {

    public static void main(String[] args) {
        System.out.println(new MinimumDifference().minimumDifference(new int[]{9, 4, 1, 7}, 2));
    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len <= k) {
            return nums[len - 1] - nums[0];
        }

        int ans = 1000000;
        for (int i = 0; i + k - 1 < len; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }

        return ans;
    }
}
