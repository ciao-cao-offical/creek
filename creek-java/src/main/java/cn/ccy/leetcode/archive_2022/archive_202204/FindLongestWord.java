package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/23 0023
 * @description https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
 * ☆☆☆ 试试【动态规划】
 */
public class FindLongestWord {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea");
        System.out.println(new FindLongestWord().findLongestWord(s, dictionary));
    }

    //模拟 + 双指针
    public String findLongestWord(String s, List<String> dictionary) {
        //可以使用【Collections.sort】替换
         /*Collections.sort(dictionary, (word1, word2) -> {
             if (word1.length() != word2.length()) {
                 return word2.length() - word1.length();
             } else {
                 return word1.compareTo(word2);
             }
         });*/
        List<String> sorted = dictionary.stream()
                .filter(dic -> dic.length() <= s.length())
                .sorted((o1, o2) -> {
                    int o1l = o1.length();
                    int o2l = o2.length();
                    if (o1l != o2l) {
                        return o2l - o1l;
                    } else {
                        return o1.compareTo(o2);
                    }
                }).collect(Collectors.toList());

        for (String dic : sorted) {
            int p1 = 0, p2 = 0;
            while (p1 < dic.length() && p2 < s.length()) {
                if (dic.charAt(p1) == s.charAt(p2)) {
                    p1++;
                }
                p2++;
            }
            if (p1 == dic.length()) {
                return dic;
            }
        }

        return "";
    }
}
