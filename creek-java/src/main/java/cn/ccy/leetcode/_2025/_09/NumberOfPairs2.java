package cn.ccy.leetcode._2025._09;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-number-of-ways-to-place-people-ii/?envType=daily-question&envId=2025-09-03">3027. 人员站位的方案数 II</a>
 * @since 2025/9/3 22:42
 * ★★★★★ 2025cvd
 */
public class NumberOfPairs2 {
    public static void main(String[] args) {

    }

    public int numberOfPairs(int[][] points) {
        int ans = 0;
        Arrays.sort(points, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        for (int i = 0; i < points.length - 1; i++) {
            int[] pointA = points[i];
            int xMin = pointA[0] - 1;
            int xMax = Integer.MAX_VALUE;
            int yMin = Integer.MIN_VALUE;
            int yMax = pointA[1] + 1;

            for (int j = i + 1; j < points.length; j++) {
                int[] pointB = points[j];
                if (pointB[0] > xMin && pointB[0] < xMax &&
                        pointB[1] > yMin && pointB[1] < yMax) {
                    ans++;
                    xMin = pointB[0];
                    yMin = pointB[1];
                }
            }
        }
        return ans;
    }
}
