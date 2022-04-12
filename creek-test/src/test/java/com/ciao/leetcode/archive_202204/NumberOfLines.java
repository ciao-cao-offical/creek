package com.ciao.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/12
 * @description https://leetcode-cn.com/problems/number-of-lines-to-write-string/
 */
public class NumberOfLines {
    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(new NumberOfLines().numberOfLines(widths, s)));
    }

    //模拟
    public int[] numberOfLines(int[] widths, String s) {
        int len = s.length();
        if (len == 1) {
            return new int[]{1, widths[s.charAt(0) - 'a']};
        }

        int count = 1;
        int left = 0;
        for (int i = 0; i < len; i++) {
            int plus = widths[s.charAt(i) - 'a'];
            if (left + plus == 100) {
                if (i < len - 1) {
                    left = 0;
                    count++;

                } else {
                    left = 100;
                }

            } else if (left + plus > 100) {
                count++;
                left = plus;

            } else {
                left += plus;
            }
        }
        return new int[]{count, left};
    }
}
