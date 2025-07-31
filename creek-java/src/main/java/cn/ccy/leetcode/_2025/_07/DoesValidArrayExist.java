package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/neighboring-bitwise-xor/?envType=daily-question&envId=2025-07-31">2683. 相邻值的按位异或</a>
 * @since 2025/7/31 23:43
 */
public class DoesValidArrayExist {
    public static void main(String[] args) {

    }

    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int x : derived) {
            xor ^= x;
        }
        return xor == 0;
    }
}
