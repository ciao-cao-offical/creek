package cn.ccy.leetcode.archive_202411;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/13 21:08:11
 * @description https://leetcode.cn/problems/count-substrings-that-satisfy-k-constraint-ii/?envType=daily-question&envId=2024-11-13
 * ☆☆☆☆☆ 2024cvd
 */
public class CountKConstraintSubstrings2 {
    public static void main(String[] args) {

    }

    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        int n = s.length();
        int[] count = new int[2];
        int[] right = new int[n];
        Arrays.fill(right, n);
        long[] prefix = new long[n + 1];
        for (int i = 0, j = 0; j < n; ++j) {
            count[s.charAt(j) - '0']++;
            while (count[0] > k && count[1] > k) {
                count[s.charAt(i) - '0']--;
                right[i] = j;
                i++;
            }
            prefix[j + 1] = prefix[j] + j - i + 1;
        }

        long[] res = new long[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0], r = queries[q][1];
            int i = Math.min(right[l], r + 1);
            long part1 = (long) (i - l + 1) * (i - l) / 2;
            long part2 = prefix[r + 1] - prefix[i];
            res[q] = part1 + part2;
        }
        return res;
    }
}
