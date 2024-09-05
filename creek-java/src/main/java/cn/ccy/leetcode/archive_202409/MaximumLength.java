package cn.ccy.leetcode.archive_202409;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/6 00:13:29
 * @description https://leetcode.cn/problems/find-the-maximum-length-of-a-good-subsequence-i/?envType=daily-question&envId=2024-09-06
 * ☆☆☆ 2024cvd
 */
public class MaximumLength {
    public static void main(String[] args) {

    }

    public int maximumLength(int[] nums, int k) {
        int ans = 0;
        int len = nums.length;
        int[][] dp = new int[len][51];
        for (int i = 0; i < len; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < len; i++) {
            dp[i][0] = 1;
            for (int l = 0; l <= k; l++) {
                for (int j = 0; j < i; j++) {
                    int add = nums[i] != nums[j] ? 1 : 0;
                    if (l - add >= 0 && dp[j][l - add] != -1) {
                        dp[i][l] = Math.max(dp[i][l], dp[j][l - add] + 1);
                    }
                }
                ans = Math.max(ans, dp[i][l]);
            }
        }

        return ans;
    }
}
