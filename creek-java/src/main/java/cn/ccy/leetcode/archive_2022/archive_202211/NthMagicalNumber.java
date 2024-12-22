package cn.ccy.leetcode.archive_2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/22 0022
 * @description https://leetcode.cn/problems/nth-magical-number/
 */
public class NthMagicalNumber {
    public static void main(String[] args) {

    }

    private static final long MOD = (long) 1e9 + 7;

    //【二分查找】+【容斥原理】，参考自：https://leetcode.cn/problems/nth-magical-number/solutions/1984641/er-fen-da-an-rong-chi-yuan-li-by-endless-9j34/
    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = (long) a / gcd(a, b) * b;
        long left = 0;
        long right = (long) Math.min(a, b) * n;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            if (mid / a + mid / b - mid / lcm >= n) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (int) (right % MOD);
    }

    //辗转相除
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
