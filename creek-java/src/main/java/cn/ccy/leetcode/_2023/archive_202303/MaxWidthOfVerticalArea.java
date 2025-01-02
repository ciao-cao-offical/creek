package cn.ccy.leetcode._2023.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/31 0031 00:57:41
 * @description https://leetcode.cn/problems/widest-vertical-area-between-two-points-containing-no-points/description/
 * cvd，整新电脑呢，没来得及做 T^T
 */
public class MaxWidthOfVerticalArea {
    public static void main(String[] args) {

    }

    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int mx = 0;
        for (int i = 1; i < points.length; i++) {
            mx = Math.max(points[i][0] - points[i - 1][0], mx);
        }
        return mx;
    }
}
