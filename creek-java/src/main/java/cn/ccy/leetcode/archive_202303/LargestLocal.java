package cn.ccy.leetcode.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/1 0001 23:03:50
 * @description https://leetcode.cn/problems/largest-local-values-in-a-matrix/
 */
public class LargestLocal {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        System.out.println(Arrays.deepToString(new LargestLocal().largestLocal(grid)));
    }

    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] maxLocal = new int[m - 2][m - 2];
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int centerI = i + 1;
                int centerJ = j + 1;
                int max = grid[centerI][centerJ];
                for (int[] dir : dirs) {
                    max = Math.max(grid[centerI + dir[0]][centerJ + dir[1]], max);
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}
