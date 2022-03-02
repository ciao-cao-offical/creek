package com.ciao.leetcode.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/2
 * @description https://leetcode-cn.com/problems/find-the-closest-palindrome/
 */
public class NearestPalindromic {
    public static void main(String[] args) {
        System.out.println(new NearestPalindromic().nearestPalindromic("123"));
    }

    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        long ans = -1;
        for (Long candidate : getCandidates(n)) {
            if (candidate != num) {
                if (ans == -1
                        || Math.abs(candidate - num) < Math.abs(ans - num)
                        || (Math.abs(candidate - num) == Math.abs(ans - num) && candidate < ans)) {
                    ans = candidate;
                }
            }
        }
        return String.valueOf(ans);
    }

    private List<Long> getCandidates(String n) {
        int len = n.length();
        ArrayList<Long> cans = new ArrayList<Long>() {{
            add((long) Math.pow(10, len - 1) - 1);
            add((long) Math.pow(10, len) + 1);
        }};
        long prefixNum = Long.parseLong(n.substring(0, (len + 1) / 2));
        for (long i = prefixNum - 1; i <= prefixNum + 1; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            String suffix = new StringBuilder(String.valueOf(i)).reverse().substring(len & 1);
            sb.append(suffix);
            cans.add(Long.valueOf(sb.toString()));
        }

        return cans;
    }
}
