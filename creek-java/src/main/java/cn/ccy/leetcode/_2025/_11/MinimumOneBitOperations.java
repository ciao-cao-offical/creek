package cn.ccy.leetcode._2025._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-one-bit-operations-to-make-integers-zero/?envType=daily-question&envId=2025-11-08">1611. 使整数变为 0 的最少操作次数</a>
 * @since 2025/11/8 17:35
 */
public class MinimumOneBitOperations {
    public static void main(String[] args) {

    }

    public int minimumOneBitOperations(int n) {
        if (n == 0) {
            return 0;
        }
        int x = Integer.toBinaryString(n).length() - 1;
        return (1 << (x + 1)) - 1 - minimumOneBitOperations(n - (1 << x));
    }
}
