package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/5
 * @description https://leetcode-cn.com/problems/path-with-maximum-gold/
 */
public class GetMaximumGold {
    private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int[][] grid = null;
    private int m, n;
    private int ans = 0;

    public static void main(String[] args) {
        System.out.println(new GetMaximumGold().getMaximumGold(new int[][]{{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}));
    }

    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    dfs(i, j, 0);
                }
            }
        }

        return ans;
    }

    private void dfs(int x, int y, int gold) {
        int cur = grid[x][y];
        gold += cur;
        ans = Math.max(ans, gold);

        grid[x][y] = 0;
        for (int d = 0; d < 4; d++) {
            int nx = x + dirs[d][0];
            int ny = y + dirs[d][1];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] > 0) {
                dfs(nx, ny, gold);
            }
        }

        grid[x][y] = cur;
    }
}
