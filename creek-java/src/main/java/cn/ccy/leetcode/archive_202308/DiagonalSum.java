package cn.ccy.leetcode.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/11 0011 00:17:20
 * @description https://leetcode.cn/problems/matrix-diagonal-sum/
 */
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(new DiagonalSum().diagonalSum(mat));
    }

    // 方法二
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    // 方法一
    /*public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += mat[i][i];
            sum += mat[i][m - 1 - i];
        }
        if (m % 2 != 0) {
            sum -= mat[m / 2][m / 2];
        }
        return sum;
    }*/
}
