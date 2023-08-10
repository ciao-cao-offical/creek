package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/28
 * @description https://leetcode-cn.com/problems/fibonacci-number/
 */
public class Fib {

    public static void main(String[] args) {
        System.out.println(new Fib().fib(4));
    }

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
            r = p + q;
        }

        return r;
    }
}
