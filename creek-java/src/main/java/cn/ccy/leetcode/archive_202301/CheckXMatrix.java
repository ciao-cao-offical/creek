package cn.ccy.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/31
 * @description https://leetcode.cn/problems/check-if-matrix-is-x-matrix/
 */
public class CheckXMatrix {
    public static void main(String[] args) {
        int[][] grid = {{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.out.println(new CheckXMatrix().checkXMatrix(grid));
    }

    //找规律
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int val = grid[i][j];
                if (i == j) {
                    if (val == 0) {
                        return false;
                    }
                    continue;

                } else if (i + j == len - 1) {
                    if (val == 0) {
                        return false;
                    }
                    continue;
                }

                if (val != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
