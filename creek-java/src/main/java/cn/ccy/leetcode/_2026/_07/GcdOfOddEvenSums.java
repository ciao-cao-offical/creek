package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/gcd-of-odd-and-even-sums/?envType=daily-question&envId=2026-07-15">3658. 奇数和与偶数和的最大公约数</a>
 * @since 2026/7/15 01:02
 */
public class GcdOfOddEvenSums {
    public static void main(String[] args) {

    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public int gcdOfOddEvenSums(int n) {
        return gcd(n * n, n * (n + 1));
    }
}
