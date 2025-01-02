package cn.ccy.leetcode._2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/7 19:28:26
 * @description https://leetcode.cn/problems/minimum-number-of-refueling-stops/?envType=daily-question&envId=2024-10-07
 * ☆☆☆☆☆ 2024cvd
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
