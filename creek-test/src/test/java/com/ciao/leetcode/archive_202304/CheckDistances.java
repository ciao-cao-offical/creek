package com.ciao.leetcode.archive_202304;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/9 0009 23:28:09
 * @description https://leetcode.cn/problems/check-distances-between-same-letters/
 */
public class CheckDistances {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(new CheckDistances().checkDistances(s, distance));
    }

    public boolean checkDistances(String s, int[] distance) {
        int[] count = new int[26];
        Arrays.fill(count, -1);
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            int c = count[cs[i] - 'a'];
            if (c != -1) {
                count[cs[i] - 'a'] = i - c - 1;
            } else {
                count[cs[i] - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (distance[i] != count[i] && count[i] != -1) {
                return false;
            }
        }

        return true;
    }
}
