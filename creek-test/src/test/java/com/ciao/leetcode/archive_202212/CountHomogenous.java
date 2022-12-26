package com.ciao.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/26 0026 23:22:18
 * @description https://leetcode.cn/problems/count-number-of-homogenous-substrings/
 */
public class CountHomogenous {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(new CountHomogenous().countHomogenous(s));
    }

    int MOD = 1000000007;

    public int countHomogenous(String s) {
        long res = 0;
        int count = 1;
        int idx = 0;
        int c = s.charAt(idx);
        while (idx + 1 < s.length()) {
            if (s.charAt(++idx) == c) {
                count++;

            } else {
                res += (long) count * (count + 1) / 2;
                count = 1;
                c = s.charAt(idx);
            }
        }
        res += (long) count * (count + 1) / 2;
        return (int) (res % MOD);
    }
}
