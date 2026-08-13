package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-length-substring-with-two-occurrences/?envType=daily-question&envId=2026-08-14">3090. 每个字符最多出现两次的最长子字符串</a>
 * @since 2026/8/14 00:44
 */
public class MaximumLengthSubstring {
    public static void main(String[] args) {

    }

    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int left = 0; left < n; left++) {
            int[] count = new int[26];
            for (int right = left; right < n; right++) {
                int ch = s.charAt(right) - 'a';
                count[ch]++;
                if (count[ch] > 2) {
                    break;
                }
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}
