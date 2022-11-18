package com.ciao.leetcode.archive_202211;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/18
 * @description https://leetcode.cn/problems/sum-of-subsequence-widths/
 * cvd，md，宇宙的尽头是数学...
 */
public class SumSubseqWidths {
    public static void main(String[] args) {

    }

    public int sumSubseqWidths(int[] nums) {
        final int MOD = 1000000007;
        Arrays.sort(nums);
        long res = 0;
        long x = nums[0], y = 2;
        for (int j = 1; j < nums.length; j++) {
            res = (res + nums[j] * (y - 1) - x) % MOD;
            x = (x * 2 + nums[j]) % MOD;
            y = y * 2 % MOD;
        }
        return (int) ((res + MOD) % MOD);
    }
}
