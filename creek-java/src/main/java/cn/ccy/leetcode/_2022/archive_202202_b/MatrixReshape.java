package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/24
 * @description https://leetcode-cn.com/problems/reshape-the-matrix/
 */
public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(new MatrixReshape().matrixReshape(mat, 1, 4)));
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; x++) {
            ans[x / c][x % c] = mat[x / n][x % n];
        }

        return ans;
    }
}
