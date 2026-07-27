package cn.ccy.leetcode._2026._07;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-palindromic-rearrangement-i/?envType=daily-question&envId=2026-07-28">3517. 最小回文排列 I</a>
 * @since 2026/7/28 00:55
 */
public class SmallestPalindrome {
    public static void main(String[] args) {

    }

    public String smallestPalindrome(String s) {
        int len = s.length();
        int partition = len / 2;

        char[] chars = s.toCharArray();
        Arrays.sort(chars, 0, partition);

        for (int i = 0; i < partition; i++) {
            chars[len - 1 - i] = chars[i];
        }

        return new String(chars);
    }
}
