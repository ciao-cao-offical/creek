package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/15 0015
 * @description https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
 * ☆☆ 学习一下【二维前缀和】
 */
public class NumMatrix {
    int[][] sums;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        sums = new int[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j + 1] = sums[i][j] + matrix[i][j];
            }
        }
    }

    public static void main(String[] args) {

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for (int i = row1; i <= row2; i++) {
            ans += (sums[i][col2 + 1] - sums[i][col1]);
        }
        return ans;
    }
}
