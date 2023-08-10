package cn.ccy.leetcode.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/27 0027
 * @description https://leetcode-cn.com/problems/pacific-atlantic-water-flow/
 */
public class PacificAtlantic {
    public static void main(String[] args) {
        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        System.out.println(new PacificAtlantic().pacificAtlantic(heights));
    }

    private int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int[][] heights;
    private int m, n;

    //深度优先+反向搜索
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        this.m = heights.length;
        this.n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        //左边界
        for (int i = 0; i < m; i++) {
            dfs(i, 0, pacific);
        }
        //上边界
        for (int j = 1; j < n; j++) {
            dfs(0, j, pacific);
        }
        //右边界
        for (int i = 0; i < m; i++) {
            dfs(i, n - 1, atlantic);
        }
        //下边界
        for (int j = 0; j < n - 1; j++) {
            dfs(m - 1, j, atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    /*ans.add(Arrays.asList(i, j));*/
                    List<Integer> cell = new ArrayList<Integer>();
                    cell.add(i);
                    cell.add(j);
                    ans.add(cell);
                }
            }
        }

        return ans;
    }

    private void dfs(int row, int col, boolean[][] ocean) {
        if (ocean[row][col]) {
            return;
        }

        ocean[row][col] = true;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && heights[newRow][newCol] >= heights[row][col]) {
                dfs(newRow, newCol, ocean);
            }
        }
    }
}
