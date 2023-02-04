package com.ciao.leetcode.archive_202302;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/4 0004 16:48:03
 * @description https://leetcode.cn/problems/maximum-number-of-consecutive-values-you-can-make/
 */
public class GetMaximumConsecutive {
    public static void main(String[] args) {
        System.out.println(new GetMaximumConsecutive().getMaximumConsecutive(new int[]{1, 1, 1, 4}));
    }

    //【贪心】【有序是一个强大的性质，如果对数组排序不影响答案的话，可以尝试将数组排序后，再重新思考，看看能否发现新的思路。】- 灵茶山艾府
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int m = 0;
        for (int coin : coins) {
            if (coin > m + 1) {
                break;
            }
            m += coin;
        }

        return m + 1;
    }
}
