package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-swaps-to-make-the-string-balanced/?envType=daily-question&envId=2025-03-17">1963. 使字符串平衡的最小交换次数</a>
 * @since 2025/3/17 23:20
 */
public class MinSwaps {
    public static void main(String[] args) {

    }

    public int minSwaps(String s) {
        int cnt = 0, mincnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                cnt += 1;
            } else {
                cnt -= 1;
                mincnt = Math.min(mincnt, cnt);
            }
        }
        return (-mincnt + 1) / 2;
    }
}
