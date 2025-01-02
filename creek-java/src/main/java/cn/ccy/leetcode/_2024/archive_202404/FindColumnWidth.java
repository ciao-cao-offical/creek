package cn.ccy.leetcode._2024.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/27 23:00:03
 * @description https://leetcode.cn/problems/find-the-width-of-columns-of-a-grid/?envType=daily-question&envId=2024-04-27
 */
public class FindColumnWidth {
    public static void main(String[] args) {

    }

    public int[] findColumnWidth(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j] = Math.max(res[j], String.valueOf(grid[i][j]).length());
            }
        }
        return res;
    }
}
