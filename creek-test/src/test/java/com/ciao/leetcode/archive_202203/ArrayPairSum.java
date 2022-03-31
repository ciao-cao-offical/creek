package com.ciao.leetcode.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/31
 * @description https://leetcode-cn.com/problems/array-partition-i/
 */
public class ArrayPairSum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(new ArrayPairSum().arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < len; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}
