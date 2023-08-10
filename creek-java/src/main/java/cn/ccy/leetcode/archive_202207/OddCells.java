package cn.ccy.leetcode.archive_202207;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/12
 * @description https://leetcode.cn/problems/cells-with-odd-values-in-a-matrix/
 * 有时间看一下【模拟空间优化】和【计数优化】
 */
public class OddCells {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(new OddCells().oddCells(m, n, indices));
    }

    //模拟
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            int r = index[0];
            for (int i = 0; i < n; i++) {
                matrix[r][i] += 1;
            }

            int c = index[1];
            for (int i = 0; i < m; i++) {
                matrix[i][c] += 1;
            }
        }

        int count = 0;
        for (int[] ints : matrix) {
            for (int i : ints) {
                if ((i & 1) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
