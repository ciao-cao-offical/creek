package cn.ccy.leetcode._2025._03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-of-substrings-containing-every-vowel-and-k-consonants-i/description/?envType=daily-question&envId=2025-03-12">3305. 元音辅音字符串计数 I</a>
 * @since 2025/3/12 22:56
 */
public class CountOfSubstrings {
    public static void main(String[] args) {

    }

    public int countOfSubstrings(String word, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int n = word.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> occur = new HashSet<>();
            int consonants = 0;
            for (int j = i; j < n; j++) {
                if (vowels.contains(word.charAt(j))) {
                    occur.add(word.charAt(j));
                } else {
                    consonants++;
                }
                if (occur.size() == 5 && consonants == k) {
                    res++;
                }
            }
        }
        return res;
    }
}
