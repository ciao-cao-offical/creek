package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/19
 * @description https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(new SubtractProductAndSum().subtractProductAndSum(234));
    }

    public int subtractProductAndSum(int n) {
        if (n == 0) {
            return 0;
        }
        int p = 1;
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            p *= i;
            sum += i;
        }
        return p - sum;
    }
}
