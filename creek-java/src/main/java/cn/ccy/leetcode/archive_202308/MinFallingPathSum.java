package cn.ccy.leetcode.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/10 0010 00:37:08
 * @description https://leetcode.cn/problems/minimum-falling-path-sum-ii/
 * ★★★★★ cvd，好困啊，好想睡觉...
 */
public class MinFallingPathSum {
    public static void main(String[] args) {

    }

    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            d[0][i] = grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == k) {
                        continue;
                    }
                    d[i][j] = Math.min(d[i][j], d[i - 1][k] + grid[i][j]);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            res = Math.min(res, d[n - 1][j]);
        }
        return res;
    }
}
