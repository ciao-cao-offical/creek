package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/4 00:01
 * @description/link https://leetcode.cn/problems/palindrome-partitioning-iv/?envType=daily-question&envId=2025-03-04
 * ☆☆☆☆☆ 2025cvd
 */
public class CheckPartitioning {
    public static void main(String[] args) {

    }

    public boolean checkPartitioning(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        for (int length = 1; length < n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;
                if (length == 1) {
                    isPalindrome[start][end] = true;
                } else if (length == 2) {
                    isPalindrome[start][end] = (s.charAt(start) == s.charAt(end));
                } else {
                    isPalindrome[start][end] = ((s.charAt(start) == s.charAt(end)) && (isPalindrome[start + 1][end - 1]));
                }
            }
        }
        for (int start = 1; start < n - 1; start++) {
            if (!isPalindrome[0][start - 1]) {
                continue;
            }
            for (int end = start; end < n - 1; end++) {
                if (isPalindrome[start][end] && isPalindrome[end + 1][n - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
