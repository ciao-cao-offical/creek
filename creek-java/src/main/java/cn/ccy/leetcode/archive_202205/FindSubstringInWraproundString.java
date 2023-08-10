package cn.ccy.leetcode.archive_202205;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/25 0025
 * @description https://leetcode.cn/problems/unique-substrings-in-wraparound-string/
 * ☆☆☆ cvd 赶需求，没时间做题啦...
 */
public class FindSubstringInWraproundString {
    public static void main(String[] args) {
        String p = "cac";
        System.out.println(new FindSubstringInWraproundString().findSubstringInWraproundString(p));
    }

    public int findSubstringInWraproundString(String p) {
        int[] dp = new int[26];
        int k = 0;
        for (int i = 0; i < p.length(); ++i) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) + 26) % 26 == 1) { // 字符之差为 1 或 -25
                ++k;
            } else {
                k = 1;
            }
            dp[p.charAt(i) - 'a'] = Math.max(dp[p.charAt(i) - 'a'], k);
        }
        return Arrays.stream(dp).sum();
    }
}
