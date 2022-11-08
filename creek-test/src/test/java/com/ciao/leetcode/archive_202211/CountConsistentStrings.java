package com.ciao.leetcode.archive_202211;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/8
 * @description https://leetcode.cn/problems/count-the-number-of-consistent-strings/
 * 看一下参考答案的【遍历】【位运算】：https://leetcode.cn/problems/count-the-number-of-consistent-strings/solutions/1953831/tong-ji-yi-zhi-zi-fu-chuan-de-shu-mu-by-38356/
 */
public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(new CountConsistentStrings().countConsistentStrings(allowed, words));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> dic = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            dic.add(c);
        }

        int count = 0;
        for (String word : words) {
            boolean pass = true;
            for (char c : word.toCharArray()) {
                if (!dic.contains(c)) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                count++;
            }
        }
        return count;
    }
}
