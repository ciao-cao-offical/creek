package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-binary-subsequence-less-than-or-equal-to-k/?envType=daily-question&envId=2025-06-26">2311. 小于等于 K 的最长二进制子序列</a>
 * @since 2025/6/26 16:49
 */
public class LongestSubsequence {
    public static void main(String[] args) {

    }

    public int longestSubsequence(String s, int k) {
        int sm = 0;
        int cnt = 0;
        int bits = (int) (Math.log(k) / Math.log(2)) + 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if (ch == '1') {
                if (i < bits && sm + (1 << i) <= k) {
                    sm += 1 << i;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}
