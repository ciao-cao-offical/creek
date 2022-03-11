package com.ciao.leetcode.archive_202203;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/10
 * @description https://leetcode-cn.com/problems/k-closest-points-to-origin/
 * ★★ 再看一下原题答案的堆和快排
 */
public class KClosest {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;
        System.out.println(Arrays.deepToString(new KClosest().kClosest(points, k)));

    }

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, k);
    }
}
