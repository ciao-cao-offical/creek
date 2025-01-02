package cn.ccy.leetcode._2024.archive_202412;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/31 21:06:11
 * @description https://leetcode.cn/problems/minimum-cost-for-cutting-cake-ii/?envType=daily-question&envId=2024-12-31
 * ☆☆☆☆☆ 2024cvd
 */
public class MinimumCost2 {
    public static void main(String[] args) {

    }

    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int h = 1, v = 1;
        long res = 0;
        int horizontalIndex = horizontalCut.length - 1, verticalIndex = verticalCut.length - 1;
        while (horizontalIndex >= 0 || verticalIndex >= 0) {
            if (verticalIndex < 0 || (horizontalIndex >= 0 && horizontalCut[horizontalIndex] > verticalCut[verticalIndex])) {
                res += horizontalCut[horizontalIndex--] * h;
                v++;
            } else {
                res += verticalCut[verticalIndex--] * v;
                h++;
            }
        }
        return res;
    }
}
