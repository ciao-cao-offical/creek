package com.ciao.leetcode;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/10
 * @description https://leetcode-cn.com/problems/interval-list-intersections/
 */
public class IntervalIntersection {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new IntervalIntersection().intervalIntersection(
                new int[][]{new int[]{0, 2}, new int[]{5, 10}, new int[]{13, 23}, new int[]{24, 25}},
                new int[][]{new int[]{1, 5}, new int[]{8, 12}, new int[]{15, 24}, new int[]{25, 26}})
        ));
    }

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        return null;
    }
}
