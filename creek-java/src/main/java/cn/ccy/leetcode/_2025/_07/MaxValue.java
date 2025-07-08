package cn.ccy.leetcode._2025._07;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-events-that-can-be-attended-ii/?envType=daily-question&envId=2025-07-08">1751. 最多可以参加的会议数目 II</a>
 * @since 2025/7/8 22:57
 * ☆☆☆☆☆ 2025cvd
 */
public class MaxValue {
    public static void main(String[] args) {

    }

    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[1]));
        int n = events.length;
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i < n; i++) {
            int p = lowerBound(events, events[i][0]);
            for (int j = 1; j <= k; j++) {
                dp[i + 1][j] = Math.max(dp[i][j], dp[p][j - 1] + events[i][2]);
            }
        }

        return dp[n][k];
    }

    private int lowerBound(int[][] events, int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][1] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
