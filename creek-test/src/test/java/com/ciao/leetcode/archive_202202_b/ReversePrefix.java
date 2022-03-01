package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/2
 * @description https://leetcode-cn.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefix {
    public static void main(String[] args) {
        System.out.println(new ReversePrefix().reversePrefix("xyxzxe", 'z'));
    }

    public String reversePrefix(String word, char ch) {
        if (word == null || word.length() == 0) {
            return word;
        }

        int index = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (ch == chars[i]) {
                index = i;
                break;
            }
        }

        for (int i = 0; i <= index / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[index - i];
            chars[index - i] = temp;
        }

        return String.valueOf(chars);
    }
}
