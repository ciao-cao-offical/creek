package com.ciao.leetcode.archive_202207;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/9 0009
 * @description https://leetcode.cn/problems/length-of-longest-fibonacci-subsequence/
 * ☆☆☆ cvd，去吃烧烤！！！！哈哈哈哈！！！
 * 试试【动态规划】
 */
public class LenLongestFibSubseq {
    public static void main(String[] args) {

    }

    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> indices = new HashMap<Integer, Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            indices.put(arr[i], i);
        }
        int[][] dp = new int[n][n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0 && arr[j] * 2 > arr[i]; j--) {
                int k = indices.getOrDefault(arr[i] - arr[j], -1);
                if (k >= 0) {
                    dp[j][i] = Math.max(dp[k][j] + 1, 3);
                }
                ans = Math.max(ans, dp[j][i]);
            }
        }
        return ans;
    }
}
