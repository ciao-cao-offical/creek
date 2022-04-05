package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/5 0005
 * @description https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/
 * 试试【判断质数优化】
 */
public class CountPrimeSetBits {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(new CountPrimeSetBits().countPrimeSetBits(left, right));
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int bits = countSetBits(i);
            //可以替换为以下方法
            //int bits =Integer.bitCount(i);
            if (isPrime(bits)) {
                ans++;
            }
        }
        return ans;
    }

    private int countSetBits(int i) {
        int count = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                count++;
            }
            i >>= 1;
        }
        return count;
    }

    //优化方法
    private boolean isPrime(int bits) {
        if (bits < 2) {
            return false;
        }

        for (int i = 2; i * i <= bits; i++) {
            if (bits % i == 0) {
                return false;
            }
        }

        return true;
    }

    //方法一
    /*private boolean isPrime(int bits) {
        if (bits == 1) {
            return false;
        }
        if (bits == 2) {
            return true;
        }
        for (int j = 2; j < bits; j++) {
            if (bits % j == 0) {
                return false;
            }
        }
        return true;
    }*/
}
