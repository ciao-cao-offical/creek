package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/5
 * @description https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 * 这个题，让我觉得自己宛如智障！
 */
public class FindLUSlength {
    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        System.out.println(new FindLUSlength().findLUSlength(a, b));

    }

    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
