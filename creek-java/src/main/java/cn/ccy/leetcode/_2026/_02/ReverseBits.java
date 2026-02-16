package cn.ccy.leetcode._2026._02;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/reverse-bits/?envType=daily-question&envId=2026-02-16">190. 颠倒二进制位</a>
 * @since 2026/2/16 21:11
 */
public class ReverseBits {
    public static void main(String[] args) {

    }

    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
