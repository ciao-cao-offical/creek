package cn.ccy.leetcode._2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/28
 * @description https://leetcode.cn/problems/shortest-common-supersequence/
 * ⭐️⭐️⭐️⭐️⭐️ cvd，上线准备中...加班...T^T
 */
public class ShortestCommonSupersequence {
    public static void main(String[] args) {

    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n; ++i) {
            dp[i][m] = n - i;
        }
        for (int i = 0; i < m; ++i) {
            dp[n][i] = m - i;
        }
        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + 1;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        int t1 = 0, t2 = 0;
        while (t1 < n && t2 < m) {
            if (str1.charAt(t1) == str2.charAt(t2)) {
                res.append(str1.charAt(t1));
                ++t1;
                ++t2;
            } else if (dp[t1 + 1][t2] == dp[t1][t2] - 1) {
                res.append(str1.charAt(t1));
                ++t1;
            } else if (dp[t1][t2 + 1] == dp[t1][t2] - 1) {
                res.append(str2.charAt(t2));
                ++t2;
            }
        }
        if (t1 < n) {
            res.append(str1.substring(t1));
        } else if (t2 < m) {
            res.append(str2.substring(t2));
        }
        return res.toString();
    }
}
