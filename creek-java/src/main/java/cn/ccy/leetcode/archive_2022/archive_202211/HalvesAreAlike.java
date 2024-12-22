package cn.ccy.leetcode.archive_2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/11
 * @description https://leetcode.cn/problems/determine-if-string-halves-are-alike/
 */
public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(new HalvesAreAlike().halvesAreAlike(s));
    }

    public boolean halvesAreAlike(String s) {
        int count = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (isVowel(s.charAt(i))) {
                if (i < len / 2) {
                    count++;

                } else {
                    count--;
                }
            }
        }
        return count == 0;
    }

    private boolean isVowel(Character c) {
        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (Character vowel : vowels) {
            if (vowel.equals(c)) {
                return true;
            }
        }

        return false;
    }
}
