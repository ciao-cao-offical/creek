package cn.ccy.leetcode._2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/5 00:52
 * @description https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/?envType=daily-question&envId=2023-10-05
 */
public class MaxProfit5 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}
