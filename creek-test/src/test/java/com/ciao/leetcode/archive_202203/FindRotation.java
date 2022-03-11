package com.ciao.leetcode.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/9
 * @description https://leetcode-cn.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 * ☆☆
 */
public class FindRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};

        System.out.println(new FindRotation().findRotation(mat, target));
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        if (Arrays.deepEquals(mat, target)) {
            return true;
        }
        int n = mat.length;
        //最多旋转3次
        for (int c = 1; c < 4; c++) {
            //遍历行
            for (int i = 0; i < n / 2; i++) {
                //遍历列
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[n - 1 - j][i];
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                    mat[j][n - 1 - i] = temp;
                }
            }

            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }
        return false;
    }
}
