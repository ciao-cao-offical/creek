package cn.ccy.leetcode._2026._05;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-special-characters-i/?envType=daily-question&envId=2026-05-26">3120. 统计特殊字母的数量 I</a>
 * @since 2026/5/26 00:04
 */
public class NumberOfSpecialChars {
    public static void main(String[] args) {

    }

    public int numberOfSpecialChars(String word) {
        Set<Character> s = new HashSet<>();
        for (char c : word.toCharArray()) {
            s.add(c);
        }
        int ans = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.contains(c) && s.contains((char) (c - 'a' + 'A'))) {
                ans++;
            }
        }
        return ans;
    }
}
