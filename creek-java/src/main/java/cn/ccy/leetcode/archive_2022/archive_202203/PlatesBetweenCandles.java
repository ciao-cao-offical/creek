package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/8
 * @description https://leetcode-cn.com/problems/plates-between-candles/
 */
public class PlatesBetweenCandles {
    public static void main(String[] args) {
        String s = "**|**|***|";
        int[][] queries = {{2, 5}, {5, 9}};
        System.out.println(Arrays.toString(new PlatesBetweenCandles().platesBetweenCandles(s, queries)));
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int len = s.length();
        int[] preSum = new int[len];
        for (int i = 1, sum = 0; i < len; i++) {
            if (s.charAt(i) == '*') {
                sum++;
            }
            preSum[i] = sum;
        }

        int[] left = new int[len];
        for (int i = 0, l = -1; i < len; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            left[i] = l;
        }

        int[] right = new int[len];
        for (int i = len - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            right[i] = r;
        }

        int ql = queries.length;
        int[] ans = new int[ql];
        for (int i = 0; i < ql; i++) {
            int[] query = queries[i];
            int x = right[query[0]];
            int y = left[query[1]];
            ans[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];

        }

        return ans;
    }
}
