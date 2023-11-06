package cn.ccy.leetcode.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/7 0007 02:34:23
 * @description https://leetcode.cn/problems/count-the-number-of-vowel-strings-in-range/?envType=daily-question&envId=2023-11-07
 */
public class VowelStrings {
    public static void main(String[] args) {

    }

    private static final String VOWEL = "aeiou";

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            if (VOWEL.indexOf(s.charAt(0)) != -1 &&
                    VOWEL.indexOf(s.charAt(s.length() - 1)) != -1) {
                ans++;
            }
        }
        return ans;
    }
}
