package com.ciao.leetcode.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/9
 * @description https://leetcode-cn.com/problems/rotate-image/
 * ★★
 */
public class Rotate {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        new Rotate().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //水平翻转
        for (int row = 0; row < n / 2; row++) {
            for (int col = 0; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[n - row - 1][col];
                matrix[n - row - 1][col] = temp;
            }
        }

        //对角翻转
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }
}
