package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/25 0025
 * @description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new MaxProfit().maxProfit(prices));
    }

    //一次遍历
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int curPrice : prices) {
            if (curPrice < minPrice) {
                minPrice = curPrice;

            } else {
                max = Math.max(curPrice - minPrice, max);
            }
        }

        return max;
    }
}
