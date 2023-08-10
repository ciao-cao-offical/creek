package cn.ccy.leetcode.archive_202307;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/27 0027 01:55:43
 * @description https://leetcode.cn/problems/delete-greatest-value-in-each-row/
 */
public class DeleteGreatestValue {
    public static void main(String[] args) {

    }

    // 排序
    public int deleteGreatestValue(int[][] grid) {
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }

        int m = grid.length;
        int n = grid[0].length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, ints[i]);
            }
            sum += max;
        }

        return sum;
    }
}
