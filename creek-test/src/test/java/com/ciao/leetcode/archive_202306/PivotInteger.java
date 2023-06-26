package com.ciao.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/26 0026 23:35:23
 * @description https://leetcode.cn/problems/find-the-pivot-integer/
 */
public class PivotInteger {
    public static void main(String[] args) {
        System.out.println(new PivotInteger().pivotInteger(8));
    }

    // md，被数学打败！
    public int pivotInteger(int n) {
        int t = (n * n + n) / 2;
        int x = (int) Math.sqrt(t);
        if (x * x == t) {
            return x;
        }
        return -1;
    }

    /*public int pivotInteger(int n) {
        int pi = -1;
        for (int i = 1; i <= n; i++) {
            int sum1 = 0;
            for (int j = 1; j <= i; j++) {
                sum1 += j;
            }
            for (int j = i; j <= n; j++) {
                sum1 -= j;
            }
            if (sum1 == 0) {
                pi = i;
                break;
            }
        }

        return pi;
    }*/
}
