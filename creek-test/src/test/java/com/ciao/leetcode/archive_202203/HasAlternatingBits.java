package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/28
 * @description https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 */
public class HasAlternatingBits {
    public static void main(String[] args) {
        System.out.println(new HasAlternatingBits().hasAlternatingBits(5));
    }

    public boolean hasAlternatingBits(int n) {
        int flag = -1;
        while (n != 0) {
            int remainder = n % 2;
            if (flag != remainder) {
                flag = remainder;
                n = n >> 1;

            } else {
                return false;
            }
        }
        return true;
    }
}
