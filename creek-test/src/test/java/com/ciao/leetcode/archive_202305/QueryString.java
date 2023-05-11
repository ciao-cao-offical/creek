package com.ciao.leetcode.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/11 15:39
 * @description https://leetcode.cn/problems/binary-string-with-substrings-representing-1-to-n/
 */
public class QueryString {
    public static void main(String[] args) {
        String s = "0110";
        int n = 3;
        System.out.println(new QueryString().queryString(s, n));
    }

    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            if (!s.contains(getBin(i))) {
                return false;
            }
        }
        return true;
    }

    private String getBin(int i) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            int r = i % 2;
            i /= 2;

            sb.append(r);
        }
        return sb.reverse().toString();
    }
}
