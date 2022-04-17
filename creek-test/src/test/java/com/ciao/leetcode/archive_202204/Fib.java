package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/9 0009
 * @description https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 * 试试【矩阵快速幂】和【通项公式】
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println(new Fib().fib(5));
    }

    //滚动数组
    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % 1000000007;
        }
        return r;
    }
}
