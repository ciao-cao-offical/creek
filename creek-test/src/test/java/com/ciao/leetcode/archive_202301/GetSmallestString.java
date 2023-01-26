package com.ciao.leetcode.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/26
 * @description https://leetcode.cn/problems/smallest-string-with-a-given-numeric-value/
 */
public class GetSmallestString {
    public static void main(String[] args) {

    }

    //【贪心】cvd，好累呀，今天和李婷去买三金了，感觉好累呀，不想动脑子了，┭┮﹏┭┮
    public String getSmallestString(int n, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int lower = Math.max(1, k - (n - i) * 26);
            k -= lower;
            ans.append((char) ('a' + lower - 1));
        }
        return ans.toString();
    }
}
