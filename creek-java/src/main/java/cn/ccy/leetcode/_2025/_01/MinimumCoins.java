package cn.ccy.leetcode._2025._01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/24 21:52:10
 * @description https://leetcode.cn/problems/minimum-number-of-coins-for-fruits/?envType=daily-question&envId=2025-01-24
 */
public class MinimumCoins {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> memo = new HashMap<>();
    int[] prices;

    public int minimumCoins(int[] prices) {
        this.prices = prices;
        return dp(0);
    }

    public int dp(int index) {
        if (2 * index + 2 >= prices.length) {
            return prices[index];
        }
        if (!memo.containsKey(index)) {
            int minValue = Integer.MAX_VALUE;
            for (int i = index + 1; i <= 2 * index + 2; i++) {
                minValue = Math.min(minValue, dp(i));
            }
            memo.put(index, prices[index] + minValue);
        }
        return memo.get(index);
    }
}
