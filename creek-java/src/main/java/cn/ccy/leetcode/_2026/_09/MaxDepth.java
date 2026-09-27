package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-nesting-depth-of-the-parentheses/?envType=daily-question&envId=2026-09-28">1614. 括号的最大嵌套深度</a>
 * @since 2026/9/28 00:16
 */
public class MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        int ans = 0, size = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                ++size;
                ans = Math.max(ans, size);
            } else if (ch == ')') {
                --size;
            }
        }
        return ans;
    }
}
