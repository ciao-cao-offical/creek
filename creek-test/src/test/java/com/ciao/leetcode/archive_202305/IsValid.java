package com.ciao.leetcode.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/3 0003 22:41:14
 * @description https://leetcode.cn/problems/check-if-word-is-valid-after-substitutions/
 */
public class IsValid {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        StringBuilder stk = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stk.append(c);
            if (stk.length() >= 3 && stk.substring(stk.length() - 3).equals("abc")) {
                stk.delete(stk.length() - 3, stk.length());
            }
        }
        return stk.length() == 0;
    }
}
