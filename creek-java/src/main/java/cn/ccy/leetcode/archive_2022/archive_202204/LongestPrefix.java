package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/23 0023
 * @description https://leetcode-cn.com/problems/longest-happy-prefix/
 * ☆☆☆☆☆ cv 【Rabin-Karp 字符串编码】和【KMP算法】
 */
public class LongestPrefix {

    public static void main(String[] args) {
        String s = "level";
    }

    //KMP算法
    public String longestPrefix(String s) {
        int n = s.length();
        int[] fail = new int[n];
        Arrays.fill(fail, -1);
        for (int i = 1; i < n; ++i) {
            int j = fail[i - 1];
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = fail[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        return s.substring(0, fail[n - 1] + 1);
    }
}
