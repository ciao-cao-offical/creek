package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/20
 * @description https://leetcode-cn.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
 */
public class NearestValidPoint {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        System.out.println(new NearestValidPoint().nearestValidPoint(x, y, points));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int md = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (md < min) {
                    index = i;
                    min = md;
                }
            }
        }
        return index;
    }
}
