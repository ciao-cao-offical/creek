package cn.ccy.leetcode.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/13 0013 00:38:09
 * @description https://leetcode.cn/problems/lexicographically-smallest-palindrome/?envType=daily-question&envId=2023-12-13
 */
public class MakeSmallestPalindrome {
    public static void main(String[] args) {

    }

    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (chars[i] > chars[j]) {
                chars[i] = chars[j];
            } else if (chars[i] < chars[j]) {
                chars[j] = chars[i];
            }
        }
        return new String(chars);
    }
}
