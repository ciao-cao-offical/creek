package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/25
 * @description https://leetcode-cn.com/problems/find-the-difference/
 */
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "abcde"));
    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (i < s.length()) {
                char c = s.charAt(i);
                Integer count = map.getOrDefault(c, 0);
                if (count == 0) {
                    map.put(c, 1);
                } else {
                    map.put(c, 0);
                }
            }

            char c = t.charAt(i);
            Integer count = map.getOrDefault(c, 0);
            if (count == 0) {
                map.put(c, 1);
            } else {
                map.put(c, 0);
            }
        }

        for (Character character : map.keySet()) {
            if (map.get(character) == 1) {
                return character;
            }
        }
        return 0;
    }
}
