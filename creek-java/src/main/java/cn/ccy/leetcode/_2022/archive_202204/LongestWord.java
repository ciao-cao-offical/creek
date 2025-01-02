package cn.ccy.leetcode._2022.archive_202204;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/22
 * @description https://leetcode-cn.com/problems/longest-word-in-dictionary/
 * ☆☆☆ 试试【字典树】
 */
public class LongestWord {
    public static void main(String[] args) {
        String[] words = {"w", "wo", "wor", "worl", "world"};
        System.out.println(new LongestWord().longestWord(words));
    }

    //哈希集合
    public String longestWord(String[] words) {
        //数组排序
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();

            } else {
                return o2.compareTo(o1);
            }
        });

        Set<String> candidates = new HashSet<>();
        candidates.add("");
        String longestWord = "";
        for (String word : words) {
            if (candidates.contains(word.substring(0, word.length() - 1))) {
                candidates.add(word);
                longestWord = word;
            }
        }
        return longestWord;
    }
}
