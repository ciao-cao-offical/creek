package com.ciao.leetcode.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/7 0007
 * @description https://leetcode.cn/problems/rearrange-spaces-between-words/
 */
public class ReorderSpaces {
    public static void main(String[] args) {
        String text = "  this   is  a sentence ";
        System.out.println(new ReorderSpaces().reorderSpaces(text));
    }

    public String reorderSpaces(String text) {
        int len = text.length();
        String[] words = text.trim().split("\\s+");
        int spaceNum = len;
        int wordsNum = words.length;
        for (String word : words) {
            spaceNum -= word.length();
        }

        StringBuilder sb = new StringBuilder();
        if (wordsNum == 1) {
            sb.append(words[0]);
            for (int i = 0; i < spaceNum; i++) {
                sb.append(" ");
            }

            return sb.toString();
        }

        int intervalSpaceNum = spaceNum / (wordsNum - 1);
        int restSpaceNum = spaceNum % (wordsNum - 1);
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                for (int j = 0; j < intervalSpaceNum; j++) {
                    sb.append(" ");
                }
            }

            sb.append(words[i]);
        }

        if (restSpaceNum != 0) {
            for (int i = 0; i < restSpaceNum; i++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
