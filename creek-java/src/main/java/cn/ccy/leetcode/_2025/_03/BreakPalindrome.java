package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/5 21:55
 * @description/link https://leetcode.cn/problems/break-a-palindrome/?envType=daily-question&envId=2025-03-05
 */
public class BreakPalindrome {
    public static void main(String[] args) {

    }

    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) {
            return "";
        }
        char[] data = palindrome.toCharArray();
        for (int i = 0; i * 2 + 1 < n; i++) {
            if (data[i] != 'a') {
                data[i] = 'a';
                return new String(data);
            }
        }
        data[n - 1] = 'b';
        return new String(data);
    }
}
