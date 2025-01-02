package cn.ccy.leetcode._2023.archive_202310;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/22 0022 21:38:11
 * @description https://leetcode.cn/problems/reducing-dishes/?envType=daily-question&envId=2023-10-22
 * ☆☆☆☆☆ cvd，let's play some dota!
 */
public class MaxSatisfaction {
    public static void main(String[] args) {

    }

    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        int[][] dp = new int[n + 1][n + 1];
        Arrays.sort(satisfaction);
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + satisfaction[i - 1] * j;
                if (j < i) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
