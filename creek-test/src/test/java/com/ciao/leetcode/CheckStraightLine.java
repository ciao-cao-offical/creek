package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/22
 * @description https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class CheckStraightLine {

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        System.out.println(new CheckStraightLine().checkStraightLine(coordinates));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates == null) {
            return false;
        }
        int len = coordinates.length;
        if (len == 2) {
            return true;
        }

        //y = ax + b ==> Ax + by = 0
        int deltaX = coordinates[0][0];
        int deltaY = coordinates[0][1];
        for (int[] coordinate : coordinates) {
            coordinate[0] -= deltaX;
            coordinate[1] -= deltaY;
        }

        int A = -coordinates[1][1];
        int B = coordinates[1][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (A * coordinates[i][0] + B * coordinates[i][1] != 0) {
                return false;
            }
        }

        return true;
    }
}
