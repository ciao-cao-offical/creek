package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/15
 * @description https://leetcode-cn.com/problems/integer-break/
 */
public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(new IntegerBreak().integerBreak(10));
    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
