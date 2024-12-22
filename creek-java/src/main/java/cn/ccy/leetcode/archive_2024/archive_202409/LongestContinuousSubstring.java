package cn.ccy.leetcode.archive_2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/19 00:10:59
 * @description https://leetcode.cn/problems/length-of-the-longest-alphabetical-continuous-substring/?envType=daily-question&envId=2024-09-19
 */
public class LongestContinuousSubstring {
    public static void main(String[] args) {

    }

    public int longestContinuousSubstring(String s) {
        int res = 1;
        int cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                cur++;
            } else {
                cur = 1;
            }
            res = Math.max(res, cur);
        }
        return res;
    }
}
