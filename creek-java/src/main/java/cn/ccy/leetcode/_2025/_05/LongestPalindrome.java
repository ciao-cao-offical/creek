package cn.ccy.leetcode._2025._05;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-palindrome-by-concatenating-two-letter-words/?envType=daily-question&envId=2025-05-25">2131. 连接两字母单词得到的最长回文串</a>
 * @since 2025/5/25 23:41
 */
public class LongestPalindrome {
    public static void main(String[] args) {

    }

    public int longestPalindrome(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        int res = 0;
        boolean mid = false;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            String word = entry.getKey();
            int cnt = entry.getValue();
            String rev = "" + word.charAt(1) + word.charAt(0);
            if (word.equals(rev)) {
                if (cnt % 2 == 1) {
                    mid = true;
                }
                res += 2 * (cnt / 2 * 2);
            } else if (word.compareTo(rev) > 0) {
                res += 4 * Math.min(freq.getOrDefault(word, 0), freq.getOrDefault(rev, 0));
            }
        }
        if (mid) {
            res += 2;
        }
        return res;
    }
}
