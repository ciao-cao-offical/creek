package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01">3330. 找到初始输入字符串 I</a>
 * @since 2025/7/1 23:19
 */
public class PossibleStringCount {
    public static void main(String[] args) {

    }

    public int possibleStringCount(String word) {
        int n = word.length(), ans = 1;
        for (int i = 1; i < n; ++i) {
            if (word.charAt(i - 1) == word.charAt(i)) {
                ++ans;
            }
        }
        return ans;
    }
}
