package cn.ccy.leetcode.archive_2023.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/14 0014 22:56:25
 * @description https://leetcode.cn/problems/find-valid-matrix-given-row-and-column-sums/
 */
public class RestoreMatrix {
    public static void main(String[] args) {
        int[] rowSum = {3, 8}, colSum = {4, 7};
        System.out.println(Arrays.deepToString(new RestoreMatrix().restoreMatrix(rowSum, colSum)));
    }

    //西北角法 数学，运筹学，yyds！
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= res[i][j];
                colSum[j] -= res[i][j];
            }
        }
        return res;
    }
}
