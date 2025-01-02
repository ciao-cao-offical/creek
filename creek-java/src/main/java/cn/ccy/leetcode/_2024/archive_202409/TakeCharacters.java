package cn.ccy.leetcode._2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/27 00:29:07
 * @description https://leetcode.cn/problems/take-k-of-each-character-from-left-and-right/?envType=daily-question&envId=2024-09-27
 */
public class TakeCharacters {
    public static void main(String[] args) {

    }

    public int takeCharacters(String s, int k) {
        int[] cnt = new int[3];
        int len = s.length();
        int ans = len;
        for (int i = 0; i < len; i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
            ans = Math.min(ans, len);
        } else {
            return -1;
        }

        int l = 0;
        for (int r = 0; r < len; r++) {
            cnt[s.charAt(r) - 'a']--;
            while (l < r && (cnt[0] < k || cnt[1] < k || cnt[2] < k)) {
                cnt[s.charAt(l) - 'a']++;
                l++;
            }
            if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
                ans = Math.min(ans, len - (r - l + 1));
            }
        }

        return ans;
    }
}
