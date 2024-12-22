package cn.ccy.leetcode.archive_2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/24 00:06:00
 * @description https://leetcode.cn/problems/maximize-number-of-subsequences-in-a-string/?envType=daily-question&envId=2024-09-24
 */
public class MaximumSubsequenceCount {
    public static void main(String[] args) {

    }

    public long maximumSubsequenceCount(String s, String pattern) {
        long res = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == pattern.charAt(1)) {
                res += cnt1;
                cnt2++;
            }
            if (s.charAt(i) == pattern.charAt(0)) {
                cnt1++;
            }
        }
        return res + Math.max(cnt1, cnt2);
    }
}
