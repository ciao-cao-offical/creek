package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/construct-product-matrix/?envType=daily-question&envId=2026-03-24">2906. 构造乘积矩阵</a>
 * @since 2026/3/24 00:10
 */
public class ConstructProductMatrix {
    public static void main(String[] args) {

    }

    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int n = grid.length, m = grid[0].length;
        int[][] p = new int[n][m];

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                p[i][j] = (int) suffix;
                suffix = suffix * grid[i][j] % MOD;
            }
        }

        long prefix = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = (int) ((long) p[i][j] * prefix % MOD);
                prefix = prefix * grid[i][j] % MOD;
            }
        }

        return p;
    }
}
