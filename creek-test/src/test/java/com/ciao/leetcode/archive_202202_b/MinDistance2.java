package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/15
 * @description https://leetcode-cn.com/problems/edit-distance/
 */
public class MinDistance2 {
    public static void main(String[] args) {
        System.out.println(new MinDistance2().minDistance("horse", "ros"));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        if (m * n == 0) {
            return m + n;
        }

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down += 1;
                }
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }

        return dp[m][n];
    }
}
