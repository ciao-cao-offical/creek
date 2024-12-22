package cn.ccy.leetcode.archive_2023.archive_202312;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/29 0029 00:08:36
 * @description https://leetcode.cn/problems/buy-two-chocolates/?envType=daily-question&envId=2023-12-29
 */
public class BuyChoco {
    public static void main(String[] args) {

    }

    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int spend = prices[0] + prices[1];
        return spend > money ? money : money - spend;
    }
}
