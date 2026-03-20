package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/flip-square-submatrix-vertically/?envType=daily-question&envId=2026-03-21">3643. 垂直翻转子矩阵</a>
 * @since 2026/3/21 00:30
 */
public class ReverseSubmatrix {
    public static void main(String[] args) {

    }

    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i0 = x, i1 = x + k - 1; i0 < i1; i0++, i1--) {
            for (int j = y; j < y + k; j++) {
                int temp = grid[i0][j];
                grid[i0][j] = grid[i1][j];
                grid[i1][j] = temp;
            }
        }
        return grid;
    }
}
