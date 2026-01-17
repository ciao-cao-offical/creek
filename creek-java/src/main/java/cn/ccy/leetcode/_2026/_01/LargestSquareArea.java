package cn.ccy.leetcode._2026._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-largest-area-of-square-inside-two-rectangles/?envType=daily-question&envId=2026-01-17">3047. 求交集区域内的最大正方形面积</a>
 * @since 2026/1/17 21:07
 */
public class LargestSquareArea {
    public static void main(String[] args) {

    }

    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        long maxSide = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int w = Math.min(topRight[i][0], topRight[j][0]) -
                        Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int h = Math.min(topRight[i][1], topRight[j][1]) -
                        Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int side = Math.min(w, h);

                maxSide = Math.max(maxSide, side);
            }
        }

        return maxSide * maxSide;
    }
}
