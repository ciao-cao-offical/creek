package com.ciao.leetcode.archive_202209;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/1 0001
 * @description https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/
 * 有时间看一下【单调栈】
 */
public class FinalPrices {
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(new FinalPrices().finalPrices(prices)));
    }

    //模拟
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            int reduction = prices[i];
            int minuend = 0;
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= reduction) {
                    minuend = prices[j];
                    break;
                }
            }

            prices[i] = reduction - minuend;
        }
        return prices;
    }
}
