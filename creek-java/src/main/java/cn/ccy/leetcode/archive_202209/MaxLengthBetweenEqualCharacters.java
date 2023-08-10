package cn.ccy.leetcode.archive_202209;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/17 0017
 * @description https://leetcode.cn/problems/largest-substring-between-two-equal-characters/
 * 试一下答案的【直接遍历】
 */
public class MaxLengthBetweenEqualCharacters {
    public static void main(String[] args) {
        String s = "cbzxy";
        System.out.println(new MaxLengthBetweenEqualCharacters().maxLengthBetweenEqualCharacters(s));
    }

    //模拟
    public int maxLengthBetweenEqualCharacters(String s) {
        int len = s.length();
        if (len == 1) {
            return -1;
        }

        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);

            } else {
                int index = s.charAt(i) - 'a';
                alpha[index] = i - map.get(s.charAt(i)) - 1;
            }
        }

        int max = -1;
        for (int i : alpha) {
            max = Math.max(i, max);
        }
        return max;
    }
}
