package cn.ccy.leetcode._2025._05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-unequal-adjacent-groups-subsequence-i/?envType=daily-question&envId=2025-05-15">2900. 最长相邻不相等子序列 I</a>
 * @since 2025/5/15 23:43
 */
public class GetLongestSubsequence {
    public static void main(String[] args) {

    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxLen = 1, endIndex = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
        }
        for (int i = 1; i < n; i++) {
            int bestLen = 1;
            int bestPrev = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (groups[i] != groups[j] && dp[j] + 1 > bestLen) {
                    bestLen = dp[j] + 1;
                    bestPrev = j;
                }
            }
            dp[i] = bestLen;
            prev[i] = bestPrev;
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                endIndex = i;
            }
        }

        List<String> res = new ArrayList<>();
        for (int i = endIndex; i != -1; i = prev[i]) {
            res.add(words[i]);
        }
        Collections.reverse(res);
        return res;
    }
}
