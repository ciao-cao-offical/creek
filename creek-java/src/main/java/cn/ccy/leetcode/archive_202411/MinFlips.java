package cn.ccy.leetcode.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/15 23:15:37
 * @description 简要描述当前类の作用
 */
public class MinFlips {
    public static void main(String[] args) {

    }

    public int minFlips(int[][] grid) {
        int rowCnt = 0, colCnt = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j1 = 0, j2 = n - 1; j1 < j2; j1++, j2--) {
                if ((grid[i][j1] ^ grid[i][j2]) != 0) {
                    rowCnt++;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i1 = 0, i2 = m - 1; i1 < i2; i1++, i2--) {
                if ((grid[i1][j] ^ grid[i2][j]) != 0) {
                    colCnt++;
                }
            }
        }
        return Math.min(colCnt, rowCnt);
    }
}
