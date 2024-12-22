package cn.ccy.leetcode.archive_2024.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/7 0007 18:04:45
 * @description https://leetcode.cn/problems/ransom-note/?envType=daily-question&envId=2024-01-07
 */
public class CanConstruct {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--map[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
