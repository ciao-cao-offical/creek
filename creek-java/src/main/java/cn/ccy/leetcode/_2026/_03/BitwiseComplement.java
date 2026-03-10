package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/complement-of-base-10-integer/?envType=daily-question&envId=2026-03-11">1009. 十进制整数的反码</a>
 * @since 2026/3/11 01:08
 */
public class BitwiseComplement {
    public static void main(String[] args) {

    }

    public int bitwiseComplement(int n) {
        int highbit = 0;
        for (int i = 1; i <= 30; ++i) {
            if (n >= 1 << i) {
                highbit = i;
            } else {
                break;
            }
        }
        int mask = highbit == 30 ? 0x7fffffff : (1 << (highbit + 1)) - 1;
        return n ^ mask;
    }
}
