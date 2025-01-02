package cn.ccy.leetcode._2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/3 22:21
 * @description https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/?envType=daily-question&envId=2023-10-03
 * ⭐️⭐️⭐️⭐️⭐️ cvd，备婚中，累死了...
 */
public class MaxProfit3 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < n; ++i) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
