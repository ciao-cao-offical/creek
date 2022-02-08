package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/23
 * @description https://leetcode-cn.com/problems/max-area-of-island/
 */
public class MaxAreaOfIsland {
    private static final int[] dx = new int[]{1, 0, -1, 0};
    private static final int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {

    }

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int max = 0;
        int mx = grid.length;
        int my = grid[0].length;
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < my; j++) {
                max = Math.max(dfs(grid, i, j, mx, my), max);
            }
        }
        return max;
    }

    //深度优先
    private int dfs(int[][] grid, int x, int y, int mx, int my) {
        if (x >= 0 && x < mx && y >= 0 && y < my) {
            if (grid[x][y] != 0) {
                int ans = 1;
                grid[x][y] = 0;
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    ans += dfs(grid, nx, ny, mx, my);
                }
                return ans;
            }
        }

        return 0;
    }
}
