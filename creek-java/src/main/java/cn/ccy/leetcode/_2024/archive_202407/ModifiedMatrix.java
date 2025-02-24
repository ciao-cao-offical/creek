package cn.ccy.leetcode._2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/5 00:18:27
 * @description https://leetcode.cn/problems/modify-the-matrix/?envType=daily-question&envId=2024-07-05
 */
public class ModifiedMatrix {
    public static void main(String[] args) {

    }

    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int j = 0; j < m; j++) {
            int zd = -1;
            for (int i = 0; i < n; i++) {
                zd = Math.max(zd, matrix[i][j]);
            }
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = zd;
                }
            }
        }
        return matrix;
    }
}
