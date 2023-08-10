package cn.ccy.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/6 0006 23:49:06
 * @description https://leetcode.cn/problems/equal-row-and-column-pairs/description/
 */
public class EqualPairs {
    public static void main(String[] args) {

    }

    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (equal(row, col, n, grid)) {
                    res++;
                }
            }
        }
        return res;
    }

    public boolean equal(int row, int col, int n, int[][] grid) {
        for (int i = 0; i < n; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }
}
