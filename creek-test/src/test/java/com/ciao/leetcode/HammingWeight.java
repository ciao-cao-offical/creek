package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/28
 * @description https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class HammingWeight {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n = n & (n - 1);
            ret++;
        }
        return ret;
    }
}
