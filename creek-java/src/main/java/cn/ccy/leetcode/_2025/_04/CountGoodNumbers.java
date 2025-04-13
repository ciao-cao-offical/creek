package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-good-numbers/?envType=daily-question&envId=2025-04-13">1922. 统计好数字的数目</a>
 * @since 2025/4/13 13:00
 * <p>
 * ☆☆☆ 2025cvd
 */
public class CountGoodNumbers {
    public static void main(String[] args) {

    }

    long mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) (quickmul(5, (n + 1) / 2) * quickmul(4, n / 2) % mod);
    }

    // 快速幂求出 x^y % mod
    public long quickmul(int x, long y) {
        long ret = 1;
        long mul = x;
        while (y > 0) {
            if (y % 2 == 1) {
                ret = ret * mul % mod;
            }
            mul = mul * mul % mod;
            y /= 2;
        }

        return ret;
    }
}
