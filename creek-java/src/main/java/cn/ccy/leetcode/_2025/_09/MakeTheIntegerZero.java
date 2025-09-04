package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-make-the-integer-zero/?envType=daily-question&envId=2025-09-05">2749. 得到整数零需要执行的最少操作数</a>
 * @since 2025/9/5 00:18
 */
public class MakeTheIntegerZero {
    public static void main(String[] args) {

    }

    public int makeTheIntegerZero(int num1, int num2) {
        int k = 1;
        while (true) {
            long x = num1 - (long) num2 * k;
            if (x < k) {
                return -1;
            }
            if (k >= Long.bitCount(x)) {
                return k;
            }
            k++;
        }
    }
}
