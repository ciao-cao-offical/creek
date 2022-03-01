package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/24
 * @description https://leetcode-cn.com/problems/matrix-diagonal-sum/
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

    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int j = m - 1 - i;
            if (j != i) {
                sum = sum + mat[i][i] + mat[i][j];

            } else {
                sum = sum + mat[i][i];
            }
        }
        return sum;
    }
}
