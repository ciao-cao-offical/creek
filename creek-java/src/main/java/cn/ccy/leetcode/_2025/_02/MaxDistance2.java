package cn.ccy.leetcode._2025._02;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/19 22:11
 * @description/link https://leetcode.cn/problems/maximum-distance-in-arrays/?envType=daily-question&envId=2025-02-19
 */
public class MaxDistance2 {
    public static void main(String[] args) {

    }

    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int n = arrays.get(0).size();
        int min_val = arrays.get(0).get(0);
        int max_val = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < arrays.size(); i++) {
            n = arrays.get(i).size();
            res = Math.max(res, Math.max(Math.abs(arrays.get(i).get(n - 1) - min_val),
                    Math.abs(max_val - arrays.get(i).get(0))));
            min_val = Math.min(min_val, arrays.get(i).get(0));
            max_val = Math.max(max_val, arrays.get(i).get(n - 1));
        }
        return res;
    }
}
