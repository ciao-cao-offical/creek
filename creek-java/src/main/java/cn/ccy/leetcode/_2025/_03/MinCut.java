package cn.ccy.leetcode._2025._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/2 22:43
 * @description/link https://leetcode.cn/problems/palindrome-partitioning-ii/?envType=daily-question&envId=2025-03-02
 * ☆☆☆☆☆ 2025cvd
 */
public class MinCut {
    public static void main(String[] args) {

    }

    public int minCut(String s) {
        int n = s.length();
        boolean[][] g = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(g[i], true);
        }

        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                g[i][j] = s.charAt(i) == s.charAt(j) && g[i + 1][j - 1];
            }
        }

        int[] f = new int[n];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < n; ++i) {
            if (g[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; ++j) {
                    if (g[j + 1][i]) {
                        f[i] = Math.min(f[i], f[j] + 1);
                    }
                }
            }
        }

        return f[n - 1];
    }
}
