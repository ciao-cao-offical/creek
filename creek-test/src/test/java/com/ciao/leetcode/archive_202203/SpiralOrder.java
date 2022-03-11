package com.ciao.leetcode.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/10
 * @description https://leetcode-cn.com/problems/spiral-matrix/
 */
public class SpiralOrder {
    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(new SpiralOrder().spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        //标记数组
        boolean[][] flag = new boolean[m][n];
        List<Integer> ans = new ArrayList<>();
        int x = 0;
        int y = 0;
        //模拟 → ↓ ← ↑
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int di = 0;
        for (int i = 0; i < total; i++) {
            ans.add(matrix[x][y]);
            flag[x][y] = true;
            int nx = x + dirs[di][0];
            int ny = y + dirs[di][1];
            if (nx < 0 || nx >= m || ny < 0 || ny >= n || flag[nx][ny]) {
                di = (di + 1) % 4;
            }
            x += dirs[di][0];
            y += dirs[di][1];
        }

        return ans;
    }
}
