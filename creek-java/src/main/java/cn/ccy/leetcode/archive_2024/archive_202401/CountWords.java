package cn.ccy.leetcode.archive_2024.archive_202401;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/12 0012 01:00:36
 * @description https://leetcode.cn/problems/count-common-words-with-one-occurrence/?envType=daily-question&envId=2024-01-12
 */
public class CountWords {
    public static void main(String[] args) {

    }

    /*public int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) > 1) {
                continue;
            }
            int partCount = 0;
            for (String s2 : words2) {
                if (s.equals(s2)) {
                    if (++partCount > 1) {
                        break;
                    }
                }
            }
            if (partCount == 1) {
                ++count;
            }
        }
        return count;
    }*/

    public int countWords(String[] words1, String[] words2) {
        // 统计字符串出现频率
        Map<String, Integer> freq1 = new HashMap<>();
        Map<String, Integer> freq2 = new HashMap<>();
        for (String w : words1) {
            freq1.put(w, freq1.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            freq2.put(w, freq2.getOrDefault(w, 0) + 1);
        }

        // 遍历 words1 出现的字符并判断是否满足要求
        int res = 0;
        for (String w : freq1.keySet()) {
            if (freq1.get(w) == 1 && freq2.getOrDefault(w, 0) == 1) {
                res++;
            }
        }
        return res;
    }
}
