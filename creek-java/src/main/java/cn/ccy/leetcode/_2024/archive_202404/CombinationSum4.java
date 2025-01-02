package cn.ccy.leetcode._2024.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/22 00:00:21
 * @description https://leetcode.cn/problems/combination-sum-iv/?envType=daily-question&envId=2024-04-22
 * ☆☆☆ 2024cvd
 */
public class CombinationSum4 {
    public static void main(String[] args) {

    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
