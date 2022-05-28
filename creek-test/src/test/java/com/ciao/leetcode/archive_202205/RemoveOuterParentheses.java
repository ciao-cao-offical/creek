package com.ciao.leetcode.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/28 0028
 * @description https://leetcode.cn/problems/remove-outermost-parentheses/solution/shan-chu-zui-wai-ceng-de-gua-hao-by-leet-sux0/
 */
public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(new RemoveOuterParentheses().removeOuterParentheses(s));
    }

    //计数
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') {
                count--;
            }

            if (count > 0) {
                sb.append(c);
            }

            if (c == '(') {
                count++;
            }
        }

        return sb.toString();
    }
}
