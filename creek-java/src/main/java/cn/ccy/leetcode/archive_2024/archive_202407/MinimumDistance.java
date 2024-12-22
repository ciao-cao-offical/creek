package cn.ccy.leetcode.archive_2024.archive_202407;

import java.util.TreeMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/9 22:33:55
 * @description https://leetcode.cn/problems/minimize-manhattan-distances/?envType=daily-question&envId=2024-07-09
 * ☆☆☆☆☆ 2024cvd
 */
public class MinimumDistance {
    public static void main(String[] args) {

    }

    public int minimumDistance(int[][] points) {
        TreeMap<Integer, Integer> sx = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> sy = new TreeMap<Integer, Integer>();
        for (int[] p : points) {
            sx.put(p[0] - p[1], sx.getOrDefault(p[0] - p[1], 0) + 1);
            sy.put(p[0] + p[1], sy.getOrDefault(p[0] + p[1], 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        for (int[] p : points) {
            sx.put(p[0] - p[1], sx.get(p[0] - p[1]) - 1);
            if (sx.get(p[0] - p[1]) == 0) {
                sx.remove(p[0] - p[1]);
            }
            sy.put(p[0] + p[1], sy.get(p[0] + p[1]) - 1);
            if (sy.get(p[0] + p[1]) == 0) {
                sy.remove(p[0] + p[1]);
            }
            res = Math.min(res, Math.max(sx.lastKey() - sx.firstKey(), sy.lastKey() - sy.firstKey()));
            sx.put(p[0] - p[1], sx.getOrDefault(p[0] - p[1], 0) + 1);
            sy.put(p[0] + p[1], sy.getOrDefault(p[0] + p[1], 0) + 1);
        }
        return res;
    }
}
