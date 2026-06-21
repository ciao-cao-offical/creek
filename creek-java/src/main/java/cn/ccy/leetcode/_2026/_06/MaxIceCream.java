package cn.ccy.leetcode._2026._06;

import java.util.Arrays;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-ice-cream-bars/?envType=daily-question&envId=2026-06-21">1833. 雪糕的最大数量</a>
 * @since 2026/6/21 09:35
 */
public class MaxIceCream {
    public static void main(String[] args) {

    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int n = costs.length;
        for (int i = 0; i < n; i++) {
            int cost = costs[i];
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
