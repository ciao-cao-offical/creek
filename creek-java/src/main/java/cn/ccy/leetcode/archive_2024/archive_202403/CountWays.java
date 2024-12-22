package cn.ccy.leetcode.archive_2024.archive_202403;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/27 0027 00:13:32
 * @description https://leetcode.cn/problems/count-ways-to-group-overlapping-ranges/?envType=daily-question&envId=Invalid%20Date
 */
public class CountWays {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        int n = ranges.length;
        int res = 1;
        for (int i = 0; i < n; ) {
            int r = ranges[i][1];
            int j = i + 1;
            while (j < n && ranges[j][0] <= r) {
                r = Math.max(r, ranges[j][1]);
                j++;
            }
            res = res * 2 % MOD;
            i = j;
        }
        return res;
    }
}
