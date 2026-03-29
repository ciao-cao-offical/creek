package cn.ccy.leetcode._2026._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-strings-can-be-made-equal-with-operations-ii/?envType=daily-question&envId=2026-03-30">2840. 判断通过操作能否让字符串相等 II</a>
 * @since 2026/3/30 00:01
 */
public class CheckStrings2 {
    public static void main(String[] args) {

    }

    public boolean checkStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            int offset = (i & 1) << 7;
            count1[offset + s1.charAt(i)]++;
            count2[offset + s2.charAt(i)]++;
        }

        return Arrays.equals(count1, count2);
    }
}
