package cn.ccy.leetcode._2026._10;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-xor-path-in-a-grid/?envType=daily-question&envId=2026-10-28">3882. 网格图中最小异或路径</a>
 * @since 2026/10/28 01:50
 */
public class MinCost {
    public static void main(String[] args) {

    }

    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] dp = new boolean[n][1024];
        boolean[] next = new boolean[1024];

        dp[0][grid[0][0]] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int value = grid[i][j];
                Arrays.fill(next, false);

                for (int k = 0; k < 1024; k++) {
                    if (dp[j][k] || (j > 0 && dp[j - 1][k])) {
                        next[k ^ value] = true;
                    }
                }

                System.arraycopy(next, 0, dp[j], 0, 1024);
            }
        }

        for (int k = 0; k < 1024; k++) {
            if (dp[n - 1][k]) {
                return k;
            }
        }

        return -1;
    }
}
