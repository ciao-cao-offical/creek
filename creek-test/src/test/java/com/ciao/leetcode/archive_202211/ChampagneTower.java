package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/20 0020
 * @description https://leetcode.cn/problems/champagne-tower/
 */
public class ChampagneTower {
    public static void main(String[] args) {

    }

    //【线性DP】参考自：https://leetcode.cn/problems/champagne-tower/solutions/1981121/by-ac_oier-c8jn/
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[query_row + 10][query_row + 10];
        dp[0][0] = poured;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[i][j] <= 1) {
                    continue;
                }

                dp[i + 1][j] += (dp[i][j] - 1) / 2;
                dp[i + 1][j + 1] += (dp[i][j] - 1) / 2;
            }
        }
        return Math.min(dp[query_row][query_glass], 1);
    }
}
