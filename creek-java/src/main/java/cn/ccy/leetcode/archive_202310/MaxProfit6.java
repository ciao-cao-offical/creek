package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/6 23:47
 * @description https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/?envType=daily-question&envId=2023-10-06
 */
public class MaxProfit6 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[n - 1][0];
    }
}
