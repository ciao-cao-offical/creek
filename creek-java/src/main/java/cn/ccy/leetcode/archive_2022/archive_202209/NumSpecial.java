package cn.ccy.leetcode.archive_2022.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/4 0004
 * @description https://leetcode.cn/problems/special-positions-in-a-binary-matrix/
 * ☆ 试一下【列的标记值】
 */
public class NumSpecial {
    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}};
        System.out.println(new NumSpecial().numSpecial(mat));
    }

    //模拟
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}
