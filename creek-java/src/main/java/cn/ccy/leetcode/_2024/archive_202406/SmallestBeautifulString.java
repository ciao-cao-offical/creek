package cn.ccy.leetcode._2024.archive_202406;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/22 23:21:27
 * @description https://leetcode.cn/problems/lexicographically-smallest-beautiful-string/?envType=daily-question&envId=2024-06-22
 */
public class SmallestBeautifulString {
    public static void main(String[] args) {

    }

    public String smallestBeautifulString(String s, int k) {
        for (int i = s.length() - 1; i >= 0; i--) {
            Set<Character> blockedCharacters = new HashSet<Character>();
            for (int j = 1; j < 3; j++) {
                if (i - j >= 0) {
                    blockedCharacters.add(s.charAt(i - j));
                }
            }
            for (int j = 1; j < 4; j++) {
                if (s.charAt(i) - 'a' + j + 1 <= k && !blockedCharacters.contains((char) (s.charAt(i) + j))) {
                    return generate(s, i, j);
                }
            }
        }
        return "";
    }

    public String generate(String s, int idx, int offset) {
        char[] res = s.toCharArray();
        res[idx] += offset;
        for (int i = idx + 1; i < s.length(); i++) {
            Set<Character> blockedCharacters = new HashSet<Character>();
            for (int j = 1; j < 3; j++) {
                if (i - j >= 0) {
                    blockedCharacters.add(res[i - j]);
                }
            }
            for (int j = 0; j < 3; j++) {
                if (!blockedCharacters.contains((char) ('a' + j))) {
                    res[i] = (char) ('a' + j);
                    break;
                }
            }
        }
        return new String(res);
    }
}
