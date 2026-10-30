package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/twisted-mirror-path-count/?envType=daily-question&envId=2026-10-31">3665. 统计镜子反射路径数目</a>
 * @since 2026/10/31 01:56
 */
public class UniquePaths {
    public static void main(String[] args) {

    }

    public int uniquePaths(int[][] grid) {
        final int MOD = 1000000007;
        int m = grid.length;
        int n = grid[0].length;

        // f[i][j][0]：通过向下移动进入 (i, j)
        // f[i][j][1]：通过向右移动进入 (i, j)
        int[][][] f = new int[m][n][2];
        f[0][0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    if (grid[i - 1][j] == 0) {
                        f[i][j][0] = (f[i - 1][j][0] + f[i - 1][j][1]) % MOD;
                    } else {
                        f[i][j][0] = f[i - 1][j][1];
                    }
                }

                if (j > 0) {
                    if (grid[i][j - 1] == 0) {
                        f[i][j][1] = (f[i][j - 1][0] + f[i][j - 1][1]) % MOD;
                    } else {
                        f[i][j][1] = f[i][j - 1][0];
                    }
                }
            }
        }

        return (f[m - 1][n - 1][0] + f[m - 1][n - 1][1]) % MOD;
    }
}
