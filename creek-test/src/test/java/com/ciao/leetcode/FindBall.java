package com.ciao.leetcode;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/24
 * @description https://leetcode-cn.com/problems/where-will-the-ball-fall/
 */
public class FindBall {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}
        };
        System.out.println(Arrays.toString(new FindBall().findBall(grid)));
    }

    public int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int col = i;
            for (int[] ints : grid) {
                int dir = ints[col];
                col += dir;
                if (col < 0 || col == n || ints[col] != dir) {
                    col = -1;
                    break;
                }
            }
            ans[i] = col;
        }

        return ans;
    }
}
