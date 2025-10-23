package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/next-greater-numerically-balanced-number/?envType=daily-question&envId=2025-10-24">2048. 下一个更大的数值平衡数</a>
 * @since 2025/10/24 00:39
 */
public class NextBeautifulNumber {
    public static void main(String[] args) {

    }

    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i <= 1224444; ++i) {
            if (isBalance(i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isBalance(int x) {
        int[] count = new int[10];
        while (x > 0) {
            count[x % 10]++;
            x /= 10;
        }
        for (int d = 0; d < 10; ++d) {
            if (count[d] > 0 && count[d] != d) {
                return false;
            }
        }
        return true;
    }
}
