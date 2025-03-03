package cn.ccy.leetcode._2025._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/4 00:04
 * @description/link https://leetcode.cn/problems/palindrome-partitioning-iii/?envType=daily-question&envId=2025-03-03
 * ☆☆☆☆☆ 2025cvd
 */
public class PalindromePartition {
    public static void main(String[] args) {

    }

    public int palindromePartition(String s, int k) {
        int n = s.length();
        int[][] f = new int[n + 1][k + 1];
        for (int[] row : f) {
            Arrays.fill(row, 1000000000);
        }
        f[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(k, i); j++) {
                if (j == 1) {
                    f[i][j] = cost(0, i - 1, s);
                } else {
                    for (int i0 = j - 1; i0 < i; i0++) {
                        f[i][j] = Math.min(f[i][j], f[i0][j - 1] + cost(i0, i - 1, s));
                    }
                }
            }
        }

        return f[n][k];
    }

    private int cost(int l, int r, String s) {
        int ret = 0;
        int i = l, j = r;
        while (i < j) {
            ret += (s.charAt(i) == s.charAt(j) ? 0 : 1);
            i++;
            j--;
        }
        return ret;
    }
}
