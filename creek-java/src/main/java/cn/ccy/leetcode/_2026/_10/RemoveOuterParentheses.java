package cn.ccy.leetcode._2026._10;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/remove-outermost-parentheses/?envType=daily-question&envId=2026-10-08">1021. 删除最外层的括号</a>
 * @since 2026/10/8 00:50
 */
public class RemoveOuterParentheses {
    public static void main(String[] args) {

    }

    public String removeOuterParentheses(String s) {
        StringBuffer res = new StringBuffer();
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                res.append(c);
            }
            if (c == '(') {
                stack.push(c);
            }
        }
        return res.toString();
    }
}
