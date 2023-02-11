package com.ciao.leetcode.archive_202302;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/11 0011 21:24:17
 * @description https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/
 */
public class FillCups {
    public static void main(String[] args) {
        int[] amount = {1, 4, 2};
        System.out.println(new FillCups().fillCups(amount));
    }

    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] > amount[0] + amount[1]) {
            return amount[2];
        }

        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
}
