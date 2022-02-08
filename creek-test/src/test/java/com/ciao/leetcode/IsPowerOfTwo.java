package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/28
 * @description https://leetcode-cn.com/problems/power-of-two/
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        //return n > 0 && ((n & (n - 1)) == 0);
        return n > 0 && ((n & (-n)) == n);
    }
}
