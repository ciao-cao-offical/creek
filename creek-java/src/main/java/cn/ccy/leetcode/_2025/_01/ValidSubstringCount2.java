package cn.ccy.leetcode._2025._01;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/10 00:11:21
 * @description https://leetcode.cn/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-ii/?envType=daily-question&envId=2025-01-10
 * ☆☆☆☆☆ 2024cvd
 */
public class ValidSubstringCount2 {
    public static void main(String[] args) {

    }

    public long validSubstringCount(String word1, String word2) {
        int[] diff = new int[26];
        for (char c : word2.toCharArray()) {
            diff[c - 'a']--;
        }

        long res = 0;
        int[] cnt = {(int) Arrays.stream(diff).filter(c -> c < 0).count()};
        int l = 0, r = 0;
        while (l < word1.length()) {
            while (r < word1.length() && cnt[0] > 0) {
                update(diff, word1.charAt(r) - 'a', 1, cnt);
                r++;
            }
            if (cnt[0] == 0) {
                res += word1.length() - r + 1;
            }
            update(diff, word1.charAt(l) - 'a', -1, cnt);
            l++;
        }
        return res;
    }

    private void update(int[] diff, int c, int add, int[] cnt) {
        diff[c] += add;
        if (add == 1 && diff[c] == 0) {
            // 表明 diff[c] 由 -1 变为 0
            cnt[0]--;
        } else if (add == -1 && diff[c] == -1) {
            // 表明 diff[c] 由 0 变为 -1
            cnt[0]++;
        }
    }
}
