package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/3
 * @description https://leetcode-cn.com/problems/implement-strstr/
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(new StrStr().strStr("abc", "c"));
    }

    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        for (int i = 0; i + nl <= hl; i++) {
            boolean flag = true;
            for (int j = 0; j < nl; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }

        return -1;
    }
}
