package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/17
 * @description https://leetcode-cn.com/problems/happy-number/
 */
public class IsHappy {
    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));
    }

    public boolean isHappy(int n) {
        int slowR = n;
        int fastR = getNext(n);
        while (fastR != 1 && slowR != fastR) {
            slowR = getNext(slowR);
            fastR = getNext(getNext(fastR));
        }

        return fastR == 1;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            totalSum += d * d;
        }

        return totalSum;
    }
}
