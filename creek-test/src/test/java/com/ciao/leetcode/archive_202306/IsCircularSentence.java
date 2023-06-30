package com.ciao.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/30 23:10
 * @description https://leetcode.cn/problems/circular-sentence/
 */
public class IsCircularSentence {
    public static void main(String[] args) {

    }

    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        if (len == 1) {
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);
        }

        if (words[0].charAt(0) != words[len - 1].charAt(words[len - 1].length() - 1)) {
            return false;
        }

        for (int i = 0; i < len - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
