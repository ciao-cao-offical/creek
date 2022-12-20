package com.ciao.leetcode.archive_202212;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/20 0020 23:41:09
 * @description https://leetcode.cn/problems/minimum-limit-of-balls-in-a-bag/description/
 */
public class MinimumSize {
    public static void main(String[] args) {

    }

    //Cvd, fuck you, Omicron!
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        while (left <= right) {
            int y = (left + right) / 2;
            long ops = 0;
            for (int x : nums) {
                ops += (x - 1) / y;
            }
            if (ops <= maxOperations) {
                ans = y;
                right = y - 1;
            } else {
                left = y + 1;
            }
        }
        return ans;
    }
}
