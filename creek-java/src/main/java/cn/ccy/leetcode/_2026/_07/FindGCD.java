package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-greatest-common-divisor-of-array/?envType=daily-question&envId=2026-07-18">1979. 找出数组的最大公约数</a>
 * @since 2026/7/18 00:02
 */
public class FindGCD {
    public static void main(String[] args) {

    }

    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for (int num : nums) {
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }
        return gcd(mx, mn);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
