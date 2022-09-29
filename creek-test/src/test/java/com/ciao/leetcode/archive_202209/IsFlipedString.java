package com.ciao.leetcode.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/29 0029
 * @description https://leetcode.cn/problems/string-rotation-lcci/
 */
public class IsFlipedString {
    public static void main(String[] args) {
        String s1 = "waterbottle", s2 = "erbottlewat";
        System.out.println(new IsFlipedString().isFlipedString(s1, s2));
    }

    //搜索字符串
    public boolean isFlipedString(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
}
