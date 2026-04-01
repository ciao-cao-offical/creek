package cn.ccy.leetcode._2026._04;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-amount-of-money-robot-can-earn/description/?envType=daily-question&envId=2026-04-02">3418. 机器人可以获得的最大金币数</a>
 * @since 2026/4/2 00:50
 */
public class MaximumAmount {
    public static void main(String[] args) {

    }

    public int maximumAmount(int[][] coins) {
        int m = coins.length, n = coins[0].length;
        int[][][] memo = new int[m][n][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(memo[i][j], Integer.MIN_VALUE);
            }
        }

        return dfs(coins, memo, 0, 0, 2);
    }

    private int dfs(int[][] coins, int[][][] memo, int i, int j, int k) {
        int m = coins.length, n = coins[0].length;
        if (i >= m || j >= n) {
            return Integer.MIN_VALUE;
        }

        int x = coins[i][j];
        // 到达终点
        if (i == m - 1 && j == n - 1) {
            return k > 0 ? Math.max(0, x) : x;
        }

        if (memo[i][j][k] != Integer.MIN_VALUE) {
            return memo[i][j][k];
        }

        // 不进行感化
        int res = Math.max(
                dfs(coins, memo, i + 1, j, k),
                dfs(coins, memo, i, j + 1, k)
        ) + x;

        if (k > 0 && x < 0) {
            // 进行感化
            res = Math.max(res, Math.max(
                    dfs(coins, memo, i + 1, j, k - 1),
                    dfs(coins, memo, i, j + 1, k - 1)
            ));
        }

        memo[i][j][k] = res;
        return res;
    }
}
