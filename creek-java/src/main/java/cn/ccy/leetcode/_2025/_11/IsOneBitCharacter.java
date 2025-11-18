package cn.ccy.leetcode._2025._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/1-bit-and-2-bit-characters/?envType=daily-question&envId=2025-11-18">717. 1 比特与 2 比特字符</a>
 * @since 2025/11/18 22:39
 */
public class IsOneBitCharacter {
    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
