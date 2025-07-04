package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-k-th-character-in-string-game-ii/?envType=daily-question&envId=2025-07-04">3307. 找出第 K 个字符 II</a>
 * @since 2025/7/4 21:28
 */
public class KthCharacter2 {
    public static void main(String[] args) {

    }

    public char kthCharacter(long k, int[] operations) {
        int ans = 0;
        int t;
        while (k != 1) {
            t = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << t) == k) {
                t--;
            }
            k = k - (1L << t);
            if (operations[t] != 0) {
                ans++;
            }
        }
        return (char) ('a' + (ans % 26));
    }
}
