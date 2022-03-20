package com.ciao.leetcode.archive_202203;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17 0017
 * @description https://leetcode-cn.com/problems/roman-to-integer/
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInt {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(new RomanToInt().romanToInt(s));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        Integer ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            Integer value = map.get(s.charAt(i));
            if (i < len - 1 && value < map.get(s.charAt(i + 1))) {
                ans -= value;

            } else {
                ans += value;
            }
        }
        return ans;
    }
}
