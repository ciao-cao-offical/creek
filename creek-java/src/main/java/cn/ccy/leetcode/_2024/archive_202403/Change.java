package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/25 0025 00:25:00
 * @description https://leetcode.cn/problems/coin-change-ii/?envType=daily-question&envId=2024-03-25
 */
public class Change {
    public static void main(String[] args) {

    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
