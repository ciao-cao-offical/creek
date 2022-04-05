package com.ciao.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/5 0005
 * @description https://leetcode-cn.com/problems/count-primes/
 * 学习一下【线性筛】
 */
public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(new CountPrimes().countPrimes(n));
    }

    //埃氏筛【厄拉多塞筛法】
    public int countPrimes(int n) {
        int ans = 0;
        if (n <= 2) {
            return 0;
        }

        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 1) {
                ans++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }

        return ans;
    }


    /*//暴力法 超时
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int ans = 1;
        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                ans++;
            }
        }
        return ans;
    }


    private boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }

        return true;
    }*/
}
