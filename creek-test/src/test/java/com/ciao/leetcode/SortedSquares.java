package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/17
 * @description https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class SortedSquares {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] ints = new int[length];
        for (int s = 0, e = length - 1, pos = length - 1; pos >= 0; ) {
            int ss = nums[s] * nums[s];
            int ee = nums[e] * nums[e];
            if (ss > ee) {
                ints[pos] = ss;
                s++;

            } else {
                ints[pos] = ee;
                e--;
            }

            pos--;
        }

        return ints;
    }
}
