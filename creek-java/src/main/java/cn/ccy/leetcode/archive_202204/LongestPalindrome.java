package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/3 0003
 * @description https://leetcode-cn.com/problems/longest-palindromic-substring/
 * ☆☆ 试试【中心扩展算法】
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(new LongestPalindrome().longestPalindrome(s));
    }

    //动态规划
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) {
            return s;
        }
        if (len == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                return s;
            } else {
                return s.substring(0, 1);
            }
        }
        char[] chars = s.toCharArray();
        int maxLen = 1;
        int start = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = i + L - 1;
                if (j >= len) {
                    break;
                }

                if (chars[i] != chars[j]) {
                    dp[i][j] = false;

                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;

                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && maxLen < L) {
                    start = i;
                    maxLen = L;
                }
            }
        }


        return s.substring(start, start + maxLen);
    }
}
