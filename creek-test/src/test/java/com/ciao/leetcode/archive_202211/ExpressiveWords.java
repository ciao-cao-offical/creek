package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/25 0025
 * @description https://leetcode.cn/problems/expressive-words/description/
 * cvd 在加班...
 */
public class ExpressiveWords {
    public static void main(String[] args) {

    }

    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            if (expand(s, word)) {
                ++ans;
            }
        }
        return ans;
    }

    private boolean expand(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            char ch = s.charAt(i);
            int cnti = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                ++cnti;
                ++i;
            }
            int cntj = 0;
            while (j < t.length() && t.charAt(j) == ch) {
                ++cntj;
                ++j;
            }
            if (cnti < cntj) {
                return false;
            }
            if (cnti != cntj && cnti < 3) {
                return false;
            }
        }
        return i == s.length() && j == t.length();
    }
}
