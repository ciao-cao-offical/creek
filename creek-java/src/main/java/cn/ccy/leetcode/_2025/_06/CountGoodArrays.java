package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-arrays-with-k-matching-adjacent-elements/?envType=daily-question&envId=2025-06-17">3405. 统计恰好有 K 个相等相邻元素的数组数目</a>
 * @since 2025/6/17 00:15
 * ☆☆☆☆☆ 2025cvd
 */
public class CountGoodArrays {
    public static void main(String[] args) {

    }

    static final int MOD = (int) 1e9 + 7;
    static final int MX = 100000;
    static long[] fact = new long[MX];
    static long[] invFact = new long[MX];

    static long qpow(long x, int n) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return res;
    }

    static {
        fact[0] = 1;
        for (int i = 1; i < MX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[MX - 1] = qpow(fact[MX - 1], MOD - 2);
        for (int i = MX - 1; i > 0; i--) {
            invFact[i - 1] = invFact[i] * i % MOD;
        }
    }

    long comb(int n, int m) {
        return fact[n] * invFact[m] % MOD * invFact[n - m] % MOD;
    }

    public int countGoodArrays(int n, int m, int k) {
        return (int) (comb(n - 1, k) * m % MOD * qpow(m - 1, n - k - 1) % MOD);
    }
}
