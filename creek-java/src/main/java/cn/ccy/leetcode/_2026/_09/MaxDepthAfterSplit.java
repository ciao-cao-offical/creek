package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/?envType=daily-question&envId=2026-09-30">1111. 有效括号的嵌套深度</a>
 * @since 2026/9/30 00:32
 */
public class MaxDepthAfterSplit {
    public static void main(String[] args) {

    }

    public int[] maxDepthAfterSplit(String seq) {
        int length = seq.length();
        int[] ans = new int[length];
        for (int i = 0; i < length; ++i) {
            ans[i] = i & 1 ^ (seq.charAt(i) == '(' ? 1 : 0);
        }
        return ans;
    }
}
