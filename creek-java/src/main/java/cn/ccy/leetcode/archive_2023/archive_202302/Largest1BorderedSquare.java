package cn.ccy.leetcode.archive_2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/17 0017 22:59:57
 * @description https://leetcode.cn/problems/largest-1-bordered-square/
 * ★★★
 */
public class Largest1BorderedSquare {
    public static void main(String[] args) {

    }

    //【动态规划】cvd，脑子不够用了...
    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] left = new int[m + 1][n + 1];
        int[][] up = new int[m + 1][n + 1];
        int maxBorder = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (grid[i - 1][j - 1] == 1) {
                    left[i][j] = left[i][j - 1] + 1;
                    up[i][j] = up[i - 1][j] + 1;
                    int border = Math.min(left[i][j], up[i][j]);
                    while (left[i - border + 1][j] < border || up[i][j - border + 1] < border) {
                        border--;
                    }
                    maxBorder = Math.max(maxBorder, border);
                }
            }
        }
        return maxBorder * maxBorder;
    }
}
