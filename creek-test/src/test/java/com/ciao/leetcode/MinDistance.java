package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/14
 * @description https://leetcode-cn.com/problems/delete-operation-for-two-strings/
 */
public class MinDistance {
    public static void main(String[] args) {
        System.out.println(new MinDistance().minDistance("sea", "eat"));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char tc1 = word1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char tc2 = word2.charAt(j - 1);

                if (tc1 == tc2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        int lcs = dp[m][n];
        return m - lcs + n - lcs;
    }
}
