package cn.ccy.leetcode._2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/1 23:23
 * @description https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=daily-question&envId=2023-10-01
 */
public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
