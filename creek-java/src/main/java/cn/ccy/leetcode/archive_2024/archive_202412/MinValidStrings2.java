package cn.ccy.leetcode.archive_2024.archive_202412;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/18 21:48:45
 * @description https://leetcode.cn/problems/minimum-number-of-valid-strings-to-form-target-ii/?envType=daily-question&envId=2024-12-18
 * ☆☆☆☆☆ 2024cvd
 */
public class MinValidStrings2 {
    public static void main(String[] args) {

    }

    public int minValidStrings(String[] words, String target) {
        int n = target.length();
        int[] back = new int[n];
        for (String word : words) {
            int[] pi = prefixFunction(word, target);
            int m = word.length();
            for (int i = 0; i < n; i++) {
                back[i] = Math.max(back[i], pi[m + 1 + i]);
            }
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1, n + 1, (int) 1e9);
        for (int i = 0; i < n; i++) {
            dp[i + 1] = dp[i + 1 - back[i]] + 1;
            if (dp[i + 1] > n) {
                return -1;
            }
        }
        return dp[n];
    }

    private int[] prefixFunction(String word, String target) {
        String s = word + "#" + target;
        int n = s.length();
        int[] pi = new int[n];
        for (int i = 1; i < n; i++) {
            int j = pi[i - 1];
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        return pi;
    }
}
