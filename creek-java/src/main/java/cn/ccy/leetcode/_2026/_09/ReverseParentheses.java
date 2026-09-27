package cn.ccy.leetcode._2026._09;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=daily-question&envId=2026-09-27">1190. 反转每对括号间的子串</a>
 * @since 2026/9/27 21:09
 */
public class ReverseParentheses {
    public static void main(String[] args) {

    }

    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<String>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(sb.toString());
                sb.setLength(0);
            } else if (ch == ')') {
                sb.reverse();
                sb.insert(0, stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
