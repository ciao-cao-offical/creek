package cn.ccy.leetcode.archive_202204;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/10 0010
 * @description https://leetcode-cn.com/problems/unique-morse-code-words/
 */
public class UniqueMorseRepresentations {
    private String[] alphabetMorseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new UniqueMorseRepresentations().uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        int len = words.length;
        if (len == 1) {
            return 1;
        }

        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(getMorseCode(word));
        }

        return set.size();
    }


    private String getMorseCode(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(alphabetMorseCode[c - 'a']);
        }
        return sb.toString();
    }
}
