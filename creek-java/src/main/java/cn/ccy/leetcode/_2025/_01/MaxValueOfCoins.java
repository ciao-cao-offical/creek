package cn.ccy.leetcode._2025._01;

import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/21 22:32:06
 * @description https://leetcode.cn/problems/maximum-value-of-k-coins-from-piles/?envType=daily-question&envId=2025-01-21
 * ☆☆☆☆☆ 2024cvd
 */
public class MaxValueOfCoins {
    public static void main(String[] args) {

    }

    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] f = new int[k + 1];
        Arrays.fill(f, -1);
        f[0] = 0;
        for (List<Integer> pile : piles) {
            for (int i = k; i > 0; --i) {
                int value = 0;
                for (int t = 1; t <= pile.size(); ++t) {
                    value += pile.get(t - 1);
                    if (i >= t && f[i - t] != -1) {
                        f[i] = Math.max(f[i], f[i - t] + value);
                    }
                }
            }
        }
        return f[k];
    }
}
