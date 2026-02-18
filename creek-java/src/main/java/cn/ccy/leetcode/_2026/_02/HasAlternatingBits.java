package cn.ccy.leetcode._2026._02;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/binary-number-with-alternating-bits/?envType=daily-question&envId=2026-02-18">693. 交替位二进制数</a>
 * @since 2026/2/18 23:20
 */
public class HasAlternatingBits {
    public static void main(String[] args) {

    }

    public boolean hasAlternatingBits(int n) {
        int prev = 2;
        while (n != 0) {
            int cur = n % 2;
            if (cur == prev) {
                return false;
            }
            prev = cur;
            n /= 2;
        }
        return true;
    }
}
