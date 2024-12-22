package cn.ccy.leetcode.archive_2024.archive_202407;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/31 23:33:54
 * @description https://leetcode.cn/problems/minimum-rectangles-to-cover-points/?envType=daily-question&envId=2024-07-31
 * ☆☆☆ 2024cvd
 */
public class MinRectanglesToCoverPoints {
    public static void main(String[] args) {

    }

    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;
        int bound = -1;
        for (int[] p : points) {
            if (p[0] > bound) {
                bound = p[0] + w;
                res++;
            }
        }
        return res;
    }
}
