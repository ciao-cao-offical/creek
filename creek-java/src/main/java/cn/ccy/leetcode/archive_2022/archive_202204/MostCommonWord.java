package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/17 0017
 * @description https://leetcode-cn.com/problems/most-common-word/
 */
public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(new MostCommonWord().mostCommonWord(paragraph, banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        int len = paragraph.length();
        int maxCount = Integer.MIN_VALUE;
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= len; i++) {
            if (i < len && Character.isLetter(paragraph.charAt(i))) {
                sb.append(Character.toLowerCase(paragraph.charAt(i)));

            } else if (sb.length() > 0) {
                String s = sb.toString();
                if (!bannedSet.contains(s)) {
                    int count = map.getOrDefault(s, 0) + 1;
                    map.put(s, count);
                    maxCount = Math.max(count, maxCount);
                }
                sb.setLength(0);
            }
        }

        String mostCommonWord = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostCommonWord = entry.getKey();
                break;
            }

        }
        return mostCommonWord;
    }
}
