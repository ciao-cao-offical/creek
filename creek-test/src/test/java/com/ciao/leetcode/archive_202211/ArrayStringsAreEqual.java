package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/1 0001
 * @description https://leetcode.cn/problems/check-if-two-string-arrays-are-equivalent/
 * 双十一开门红，顺利完成任务，加油加油💪，happy happy！
 */
public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(new ArrayStringsAreEqual().arrayStringsAreEqual(word1, word2));
    }

    //模拟
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0, p2 = 0, i = 0, j = 0;
        while (p1 < word1.length && p2 < word2.length) {
            if (word1[p1].charAt(i) != word2[p2].charAt(j)) {
                return false;
            }
            i++;
            if (i == word1[p1].length()) {
                p1++;
                i = 0;
            }
            j++;
            if (j == word2[p2].length()) {
                p2++;
                j = 0;
            }
        }
        return p1 == word1.length && p2 == word2.length;
    }
}
