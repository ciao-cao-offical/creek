package cn.ccy.leetcode._2026._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/concatenation-of-consecutive-binary-numbers/?envType=daily-question&envId=2026-02-28">1680. 连接连续二进制数字</a>
 * @since 2026/2/28 00:24
 */
public class ConcatenatedBinary {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int concatenatedBinary(int n) {
        int res = 0, shift = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                // 说明是2的幂，则进位
                shift++;
            }
            res = (int) ((((long) res << shift) + i) % MOD);
        }
        return res;
    }
}
