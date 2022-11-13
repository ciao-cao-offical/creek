package com.ciao.leetcode.archive_202211;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/13 0013
 * @description https://leetcode.cn/problems/custom-sort-string/
 * 看看答案的【计数排序】：https://leetcode.cn/problems/custom-sort-string/solutions/1963410/zi-ding-yi-zi-fu-chuan-pai-xu-by-leetcod-1qvf/
 */
public class CustomSortString {
    public static void main(String[] args) {
        String order = "kqep", s = "pekeq";
        System.out.println(new CustomSortString().customSortString(order, s));
    }

    //【简单模拟】
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.toCharArray().length; i++) {
            map.put(order.charAt(i), i);
        }

        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(chars[i])) {
                continue;
            }
            int mi = i;
            for (int j = i + 1; j < len; j++) {
                char cj = chars[j];
                if (!map.containsKey(cj)) {
                    continue;
                }
                if (map.get(chars[mi]) > map.get(cj)) {
                    mi = j;
                }
            }

            if (mi != i) {
                char temp = chars[i];
                chars[i] = chars[mi];
                chars[mi] = temp;
            }
        }
        return String.valueOf(chars);
    }
}
