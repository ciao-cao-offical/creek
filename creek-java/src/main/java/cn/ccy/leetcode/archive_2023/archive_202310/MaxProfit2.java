package cn.ccy.leetcode.archive_2023.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/2 11:37
 * @description https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/?envType=daily-question&envId=2023-10-02
 */
public class MaxProfit2 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(0, prices[i] - prices[i - 1]);
        }

        return res;
    }
}
