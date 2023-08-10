package cn.ccy.leetcode.archive_202204;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/3 0003
 * @description https://leetcode-cn.com/problems/valid-parentheses/submissions/
 */
public class IsValid {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(new IsValid().isValid(s));
    }

    public boolean isValid(String s) {
        //'('，')'，'{'，'}'，'['，']'
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.addFirst(c);

            } else if (stack.isEmpty()) {
                return false;

            } else {
                char pop = stack.pop();
                if (pop == '(' && c != ')') {
                    return false;

                } else if (pop == '{' && c != '}') {
                    return false;

                } else if (pop == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
