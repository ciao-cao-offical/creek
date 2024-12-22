package cn.ccy.leetcode.archive_2024.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/3 19:43
 * @description https://leetcode.cn/problems/minimum-cost-to-reach-destination-in-time/?envType=daily-question&envId=2024-10-03
 * ⭐️⭐️⭐️⭐️⭐️ 2024cvd
 */
public class MinCost {
    public static void main(String[] args) {

    }

    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length;
        int[][] f = new int[maxTime + 1][n];
        for (int i = 0; i <= maxTime; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }
        f[0][0] = passingFees[0];
        for (int t = 1; t <= maxTime; t++) {
            for (int[] edge : edges) {
                int i = edge[0], j = edge[1], cost = edge[2];
                if (cost <= t) {
                    if (f[t - cost][j] != Integer.MAX_VALUE) {
                        f[t][i] = Math.min(f[t][i], f[t - cost][j] + passingFees[i]);
                    }
                    if (f[t - cost][i] != Integer.MAX_VALUE) {
                        f[t][j] = Math.min(f[t][j], f[t - cost][i] + passingFees[j]);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int t = 1; t <= maxTime; t++) {
            ans = Math.min(ans, f[t][n - 1]);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
