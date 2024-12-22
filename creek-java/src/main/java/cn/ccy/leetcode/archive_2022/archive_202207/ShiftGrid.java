package cn.ccy.leetcode.archive_2022.archive_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/20 0020
 * @description https://leetcode.cn/problems/shift-2d-grid/
 */
public class ShiftGrid {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        System.out.println(new ShiftGrid().shiftGrid(grid, k));
    }

    //一维展开
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        //初始化
        for (int i = 0; i < m; i++) {
            List<Integer> part = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                part.add(0);
            }
            result.add(part);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = (i * n + j + k) % (m * n);
                result.get(index / n).set(index % n, grid[i][j]);
            }
        }

        return result;
    }


}
