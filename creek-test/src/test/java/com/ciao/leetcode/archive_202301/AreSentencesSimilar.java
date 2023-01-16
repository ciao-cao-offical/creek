package com.ciao.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/16 0016 23:44:34
 * @description https://leetcode.cn/problems/sentence-similarity-iii/
 */
public class AreSentencesSimilar {
    public static void main(String[] args) {

    }

    //【字符串按空格分割 + 双指针】：cvd，今天加班，明天回家，收拾收拾，偷个懒吧，hahaha
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        int i = 0, j = 0;
        while (i < words1.length && i < words2.length && words1[i].equals(words2[i])) {
            i++;
        }
        while (j < words1.length - i && j < words2.length - i && words1[words1.length - j - 1].equals(words2[words2.length - j - 1])) {
            j++;
        }
        return i + j == Math.min(words1.length, words2.length);
    }
}
