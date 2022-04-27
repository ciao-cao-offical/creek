package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/26 0026
 * @description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class MaxProfit2 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new MaxProfit2().maxProfit(prices));
    }

    //贪心
    /*public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return profit;
    }*/

    //动态规划1
    /*public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[len - 1][0];
    }*/

    //动态规划2
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int dp0 = 0, dp1 = -prices[0];
        for (int price : prices) {
            int ndp0 = Math.max(dp0, dp1 + price);
            int ndp1 = Math.max(dp1, dp0 - price);
            dp0 = ndp0;
            dp1 = ndp1;
        }

        return dp0;
    }
}
