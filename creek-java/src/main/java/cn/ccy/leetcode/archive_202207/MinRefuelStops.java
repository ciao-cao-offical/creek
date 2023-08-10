package cn.ccy.leetcode.archive_202207;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/2 0002
 * @description https://leetcode.cn/problems/minimum-number-of-refueling-stops/
 * ☆☆☆☆☆ cvd，整理面试题
 */
public class MinRefuelStops {
    public static void main(String[] args) {

    }

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        long[] dp = new long[n + 1];
        dp[0] = startFuel;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (dp[j] >= stations[i][0]) {
                    dp[j + 1] = Math.max(dp[j + 1], dp[j] + stations[i][1]);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (dp[i] >= target) {
                return i;
            }
        }
        return -1;
    }
}
