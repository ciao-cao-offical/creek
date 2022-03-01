package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/29
 * @description https://leetcode-cn.com/problems/single-number/
 */
public class SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s ^= num;
        }
        return s;
    }
}
