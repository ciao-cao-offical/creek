package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-number-with-all-set-bits/?envType=daily-question&envId=2025-10-29">3370. 仅含置位位的最小整数</a>
 * @since 2025/10/29 00:27
 */
public class SmallestNumber {
    public static void main(String[] args) {

    }

    public int smallestNumber(int n) {
        int x = 1;
        while (x < n) {
            x = x * 2 + 1;
        }
        return x;
    }
}
