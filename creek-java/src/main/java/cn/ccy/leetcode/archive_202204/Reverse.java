package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/6
 * @description https://leetcode-cn.com/problems/reverse-integer/
 * ☆☆☆ cv
 */
public class Reverse {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(new Reverse().reverse(x));
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
