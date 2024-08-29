package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/29 22:09:44
 * @description https://leetcode.cn/problems/check-if-grid-satisfies-conditions/?envType=daily-question&envId=2024-08-29
 */
public class SatisfiesConditions {
    public static void main(String[] args) {

    }

    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
