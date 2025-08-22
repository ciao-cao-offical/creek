package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-minimum-area-to-cover-all-ones-i/?envType=daily-question&envId=2025-08-22">3195. 包含所有 1 的最小矩形面积 I</a>
 * @since 2025/8/22 22:37
 */
public class MinimumArea {
    public static void main(String[] args) {

    }

    public int minimumArea(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int min_i = n, max_i = 0;
        int min_j = m, max_j = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    min_i = Math.min(min_i, i);
                    max_i = Math.max(max_i, i);
                    min_j = Math.min(min_j, j);
                    max_j = Math.max(max_j, j);
                }
            }
        }
        return (max_i - min_i + 1) * (max_j - min_j + 1);
    }
}
