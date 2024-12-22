package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/28
 * @description https://leetcode-cn.com/problems/valid-anagram/
 */
public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(new IsAnagram().isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            counts[c - 'a']--;
        }

        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
