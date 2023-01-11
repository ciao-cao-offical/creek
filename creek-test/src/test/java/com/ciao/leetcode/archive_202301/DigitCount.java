package com.ciao.leetcode.archive_202301;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/11 0011 23:03:17
 * @description https://leetcode.cn/problems/check-if-number-has-equal-digit-count-and-digit-value/
 */
public class DigitCount {
    public static void main(String[] args) {
        System.out.println('3' - '0');
        String num = "1210";
        System.out.println(new DigitCount().digitCount(num));
    }

    public boolean digitCount(String num) {
        Map<Integer, Integer> h = new HashMap<>();
        int n = num.length();
        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            h.put(digit, h.getOrDefault(digit, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int v = num.charAt(i) - '0';
            if (h.getOrDefault(i, 0) != v) {
                return false;
            }
        }
        return true;
    }

}
