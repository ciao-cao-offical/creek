package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/1 0001
 * @description https://leetcode.cn/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
 */
public class NearestValidPoint {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        System.out.println(new NearestValidPoint().nearestValidPoint(x, y, points));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int idx = -1;
        int md = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int thisMd = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                
                if (md > thisMd) {
                    idx = i;
                    md = thisMd;
                }
            }
        }

        return idx;
    }
}
