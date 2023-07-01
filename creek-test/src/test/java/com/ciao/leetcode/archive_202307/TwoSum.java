package com.ciao.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/1 19:29
 * @description https://leetcode.cn/problems/two-sum/
 */
public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
