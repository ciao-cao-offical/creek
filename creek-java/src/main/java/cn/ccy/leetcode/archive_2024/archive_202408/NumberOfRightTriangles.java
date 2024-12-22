package cn.ccy.leetcode.archive_2024.archive_202408;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/2 22:55:53
 * @description https://leetcode.cn/problems/right-triangles/?envType=daily-question&envId=2024-08-02
 */
public class NumberOfRightTriangles {
    public static void main(String[] args) {

    }

    public long numberOfRightTriangles(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                col[j] += grid[i][j];
            }
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            int row = Arrays.stream(grid[i]).sum();
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    res += (row - 1) * (col[j] - 1);
                }
            }
        }
        return res;
    }
}
