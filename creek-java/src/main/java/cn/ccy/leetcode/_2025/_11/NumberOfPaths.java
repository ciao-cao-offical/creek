package cn.ccy.leetcode._2025._11;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/paths-in-matrix-whose-sum-is-divisible-by-k/?envType=daily-question&envId=2025-11-26">2435. 矩阵中和能被 K 整除的路径</a>
 * @since 2025/11/26 22:23
 * ⭐️⭐️⭐️⭐️⭐️ 2025cvd
 */
public class NumberOfPaths {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        long[][][] dp = new long[m + 1][n + 1][k];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) {
                    dp[i][j][grid[0][0] % k] = 1;
                    continue;
                }

                int value = grid[i - 1][j - 1] % k;
                for (int r = 0; r < k; r++) {
                    int prevMod = (r - value + k) % k;
                    dp[i][j][r] = (dp[i - 1][j][prevMod] + dp[i][j - 1][prevMod]) % MOD;
                }
            }
        }

        return (int) dp[m][n][0];
    }
}
