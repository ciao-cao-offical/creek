package com.ciao.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/3 0003 23:33:15
 * @description https://leetcode.cn/problems/check-if-numbers-are-ascending-in-a-sentence/
 */
public class AreNumbersAscending {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(new AreNumbersAscending().areNumbersAscending(s));
    }

    //解决别的问题，简单题我就轻拳处理了...
    public boolean areNumbersAscending(String s) {
        Integer pre = null;
        for (String part : s.split(" ")) {
            if (Character.isDigit(part.charAt(0))) {
                int cur = Integer.parseInt(part);
                if (pre != null) {
                    if (cur <= pre) {
                        return false;
                    }
                }

                pre = cur;
            }
        }
        return true;
    }
}
