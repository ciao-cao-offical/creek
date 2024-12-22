package cn.ccy.leetcode.archive_2022.archive_202210;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/9
 * @description https://leetcode.cn/problems/score-of-parentheses/
 */
public class ScoreOfParentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(new ScoreOfParentheses().scoreOfParentheses(s));
    }

    //栈
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                Integer pop = stack.pop();
                stack.push(stack.pop() + Math.max(2 * pop, 1));
            }
        }

        return stack.pop();
    }
}
