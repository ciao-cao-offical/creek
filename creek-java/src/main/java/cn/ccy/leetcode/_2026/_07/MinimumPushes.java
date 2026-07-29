package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-pushes-to-type-word-i/?envType=daily-question&envId=2026-07-30">3014. 输入单词需要的最少按键次数 I</a>
 * @since 2026/7/30 01:02
 */
public class MinimumPushes {
    public static void main(String[] args) {

    }

    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += i / 8 + 1;
        }
        return ans;
    }
}
