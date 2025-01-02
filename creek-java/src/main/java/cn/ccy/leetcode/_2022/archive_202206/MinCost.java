package cn.ccy.leetcode._2022.archive_202206;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/25 0025
 * @description https://leetcode.cn/problems/JEj789/
 * 【动态规划】+【滚动数组】
 */
public class MinCost {
    public static void main(String[] args) {
        int[][] costs = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
        System.out.println(new MinCost().minCost(costs));
    }

    public int minCost(int[][] costs) {
        int len = costs.length;
        int[] dp = new int[3];
        for (int i = 0; i < 3; i++) {
            dp[i] = costs[0][i];
        }
        for (int i = 1; i < len; i++) {
            int[] newDp = new int[3];
            for (int j = 0; j < 3; j++) {
                newDp[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = newDp;
        }


        return Arrays.stream(dp).min().getAsInt();
    }
}
