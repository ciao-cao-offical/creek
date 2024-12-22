package cn.ccy.leetcode.archive_2023.archive_202311;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/30 0030 00:55:48
 * @description https://leetcode.cn/problems/determine-if-two-strings-are-close/?envType=daily-question&envId=2023-11-30
 * ☆☆☆ 2023b2t
 */
public class CloseStrings {
    public static void main(String[] args) {

    }

    public boolean closeStrings(String word1, String word2) {
        int[] count1 = new int[26], count2 = new int[26];
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] > 0 && count2[i] == 0 || count1[i] == 0 && count2[i] > 0) {
                return false;
            }
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return Arrays.equals(count1, count2);
    }
}
