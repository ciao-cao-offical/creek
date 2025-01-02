package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = extendFromCenter(s, i, i);
            int l2 = extendFromCenter(s, i, i + 1);
            int ml = Math.max(l1, l2);
            if (ml > end - start) {
                start = i - (ml - 1) / 2;
                end = i + ml / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int extendFromCenter(String s, int start, int end) {
        int len = s.length();
        while (start >= 0 && end < len && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}
