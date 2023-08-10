package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/27 0027
 * @description https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
 */
public class MaxIncreaseKeepingSkyline {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(new MaxIncreaseKeepingSkyline().maxIncreaseKeepingSkyline(grid));
    }

    //贪心
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        //行最大值
        int[] rowMax = new int[n];
        //列最大值
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
