package cn.ccy.leetcode._2026._02;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/prime-number-of-set-bits-in-binary-representation/?envType=daily-question&envId=2026-02-21">762. 二进制表示中质数个计算置位</a>
 * @since 2026/2/21 22:06
 */
public class CountPrimeSetBits {
    public static void main(String[] args) {

    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int x = left; x <= right; ++x) {
            if (isPrime(Integer.bitCount(x))) {
                ++ans;
            }
        }
        return ans;
    }

    private boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
