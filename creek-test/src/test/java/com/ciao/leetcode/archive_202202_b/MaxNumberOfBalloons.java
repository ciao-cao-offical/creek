package com.ciao.leetcode.archive_202202_b;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/13
 * @description https://leetcode-cn.com/problems/maximum-number-of-balloons/
 */
public class MaxNumberOfBalloons {
    // balloon
    private Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('b', 0);
            put('a', 0);
            put('l', 0);
            put('o', 0);
            put('n', 0);
        }
    };

    public static void main(String[] args) {
        System.out.println(new MaxNumberOfBalloons().maxNumberOfBalloons("nlaebolko"));
    }

    public int maxNumberOfBalloons(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }

        for (char c : text.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'l' || entry.getKey() == 'o') {
                ans = Math.min(ans, entry.getValue() / 2);

            } else {
                ans = Math.min(ans, entry.getValue());
            }
        }
        return ans;
    }

}
