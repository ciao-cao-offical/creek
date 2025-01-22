package cn.ccy.leetcode._2025._01;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/22 22:19:23
 * @description https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/?envType=daily-question&envId=2025-01-22
 */
public class MaxCoins {
    public static void main(String[] args) {

    }

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int length = piles.length;
        int rounds = length / 3;
        int coins = 0;
        int index = length - 2;
        for (int i = 0; i < rounds; i++) {
            coins += piles[index];
            index -= 2;
        }
        return coins;
    }
}
