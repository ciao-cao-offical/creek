package com.ciao.leetcode.archive_202203;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/21
 * @description https://leetcode-cn.com/problems/valid-parentheses/
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(new IsValid().isValid("]"));
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : chars) {
            if ('(' == c || '{' == c || '[' == c) {
                deque.push(c);
                continue;

            } else if (deque.isEmpty()) {
                return false;
            }
            char pop = deque.pop();
            if (')' == c) {
                if (pop != '(') {
                    return false;
                }

            } else if ('}' == c) {
                if (pop != '{') {
                    return false;
                }

            } else if (']' == c) {
                if (pop != '[') {
                    return false;
                }

            } else {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
