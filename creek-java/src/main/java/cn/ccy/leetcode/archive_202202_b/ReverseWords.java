package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/19
 * @description https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords {
    private static final char SPACE = ' ';

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String s = new ReverseWords().reverseWords(str);
        System.out.println(s);
    }

    public String reverseWords(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (SPACE != chars[i]) {
                int j;
                for (j = i; j < len; j++) {
                    if (SPACE == chars[j]) {
                        break;
                    }
                }

                char temp;
                for (int k = j - 1; i < k; i++, k--) {
                    temp = chars[i];
                    chars[i] = chars[k];
                    chars[k] = temp;
                }

                i = j;
            }
        }

        return String.valueOf(chars);
    }
}
