package cn.ccy.leetcode._2024.archive_202412;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/25 17:48:32
 * @description https://leetcode.cn/problems/minimum-cost-for-cutting-cake-i/?envType=daily-question&envId=2024-12-25
 * ☆☆☆ 2024cvd
 */
public class MinimumCost {
    public static void main(String[] args) {

    }

    int[][][][] memo;
    int[] horizontalCut;
    int[] verticalCut;

    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        this.memo = new int[m][n][m][n];
        this.horizontalCut = horizontalCut;
        this.verticalCut = verticalCut;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    Arrays.fill(memo[i][j][k], -1);
                }
            }
        }
        return dp(0, 0, m - 1, n - 1);
    }

    public int dp(int row1, int col1, int row2, int col2) {
        if (row1 == row2 && col1 == col2) {
            return 0;
        }
        if (memo[row1][col1][row2][col2] < 0) {
            int res = Integer.MAX_VALUE;
            for (int i = row1; i < row2; i++) {
                res = Math.min(res, dp(row1, col1, i, col2) + dp(i + 1, col1, row2, col2) + horizontalCut[i]);
            }
            for (int i = col1; i < col2; i++) {
                res = Math.min(res, dp(row1, col1, row2, i) + dp(row1, i + 1, row2, col2) + verticalCut[i]);
            }
            memo[row1][col1][row2][col2] = res;
        }
        return memo[row1][col1][row2][col2];
    }
}
