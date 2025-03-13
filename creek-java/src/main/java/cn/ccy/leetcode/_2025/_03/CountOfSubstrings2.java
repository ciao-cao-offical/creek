package cn.ccy.leetcode._2025._03;

import com.google.common.collect.Sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/?envType=daily-question&envId=2025-03-13">3306. 元音辅音字符串计数 II</a>
 * @since 2025/3/13 23:53
 */
public class CountOfSubstrings2 {
    public static void main(String[] args) {

    }

    public long count(String word, int m) {
        Set<Character> vowels = Sets.newHashSet('a', 'e', 'i', 'o', 'u');
        int n = word.length(), consonants = 0;
        long res = 0;
        Map<Character, Integer> occur = new HashMap<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && (consonants < m || occur.size() < 5)) {
                char ch = word.charAt(j);
                if (vowels.contains(ch)) {
                    occur.put(ch, occur.getOrDefault(ch, 0) + 1);
                } else {
                    consonants++;
                }
                j++;
            }
            if (consonants >= m && occur.size() == 5) {
                res += n - j + 1;
            }
            char left = word.charAt(i);
            if (vowels.contains(left)) {
                occur.put(left, occur.get(left) - 1);
                if (occur.get(left) == 0) {
                    occur.remove(left);
                }
            } else {
                consonants--;
            }
        }
        return res;
    }

    public long countOfSubstrings(String word, int k) {
        return count(word, k) - count(word, k + 1);
    }
}
