package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/27
 * @description https://leetcode-cn.com/problems/optimal-division/
 * ☆☆ 最好再试一下DP!
 */
public class OptimalDivision {
    public static void main(String[] args) {
        int[] nums = {1000, 100, 10, 2};
        System.out.println(new OptimalDivision().optimalDivision(nums));
    }

    public String optimalDivision(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return String.valueOf(nums[0]);
        }
        if (len == 2) {
            return String.format("%d/%d", nums[0], nums[1]);
        }

        StringBuilder sb = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < len; i++) {
            sb.append("/").append(nums[i]);
        }
        sb.append(")");

        return sb.toString();
    }
}
