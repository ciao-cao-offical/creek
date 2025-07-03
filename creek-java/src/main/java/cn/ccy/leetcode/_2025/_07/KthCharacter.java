package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-k-th-character-in-string-game-i/?envType=daily-question&envId=2025-07-03">3304. 找出第 K 个字符 I</a>
 * @since 2025/7/3 22:33
 */
public class KthCharacter {
    public static void main(String[] args) {

    }

    public char kthCharacter(int k) {
        int ans = 0;
        int t;
        while (k != 1) {
            t = 31 - Integer.numberOfLeadingZeros(k);
            if ((1 << t) == k) {
                t--;
            }
            k = k - (1 << t);
            ans++;
        }
        return (char) ('a' + ans);
    }
}
