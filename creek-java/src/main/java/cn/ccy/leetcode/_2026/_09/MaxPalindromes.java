package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-non-overlapping-palindrome-substrings/?envType=daily-question&envId=2026-09-15">2472. 不重叠回文子字符串的最大数目</a>
 * @since 2026/9/15 01:37
 * ★★★★★ 2026cvd
 */
public class MaxPalindromes {
    public static void main(String[] args) {

    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        for (int len = 1; len <= n; ++len) {
            for (int left = 0; left + len <= n; ++left) {
                int right = left + len - 1;
                isPalindrome[left][right] = s.charAt(left) == s.charAt(right) &&
                        (len <= 2 || isPalindrome[left + 1][right - 1]);
            }
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            dp[i] = dp[i - 1];
            for (int j = 0; j + k <= i; ++j) {
                if (isPalindrome[j][i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n];
    }
}
