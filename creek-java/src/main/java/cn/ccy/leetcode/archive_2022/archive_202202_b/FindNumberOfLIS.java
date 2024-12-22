package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/13
 * @description https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/
 */
public class FindNumberOfLIS {
    public static void main(String[] args) {
        System.out.println(new FindNumberOfLIS().findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
    }

    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        int count = 0;
        int maxLen = 0;
        int[] dp = new int[len];
        int[] counts = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        counts[i] = counts[j];

                    } else if (dp[j] + 1 == dp[i]) {
                        counts[i] += counts[j];
                    }
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                count = counts[i];

            } else if (dp[i] == maxLen) {
                count += counts[i];
            }


        }
        return count;
    }
}
