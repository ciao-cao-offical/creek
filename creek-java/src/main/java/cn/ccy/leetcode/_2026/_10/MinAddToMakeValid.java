package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/?envType=daily-question&envId=2026-10-06">921. 使括号有效的最少添加</a>
 * @since 2026/10/6 23:33
 */
public class MinAddToMakeValid {
    public static void main(String[] args) {

    }

    public int minAddToMakeValid(String s) {
        int ans = 0;
        int leftCount = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    ans++;
                }
            }
        }
        ans += leftCount;
        return ans;
    }
}