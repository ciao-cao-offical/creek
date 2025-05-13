package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/total-characters-in-string-after-transformations-i/?envType=daily-question&envId=2025-05-13">3335. 字符串转换后的长度 I</a>
 * @since 2025/5/13 23:18
 */
public class LengthAfterTransformations {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            ++cnt[ch - 'a'];
        }
        for (int round = 0; round < t; ++round) {
            int[] nxt = new int[26];
            nxt[0] = cnt[25];
            nxt[1] = (cnt[25] + cnt[0]) % MOD;
            for (int i = 2; i < 26; ++i) {
                nxt[i] = cnt[i - 1];
            }
            cnt = nxt;
        }
        int ans = 0;
        for (int i = 0; i < 26; ++i) {
            ans = (ans + cnt[i]) % MOD;
        }
        return ans;
    }
}
