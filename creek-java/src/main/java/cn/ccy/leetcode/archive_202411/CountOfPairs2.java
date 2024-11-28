package cn.ccy.leetcode.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/29 00:31:26
 * @description https://leetcode.cn/problems/find-the-count-of-monotonic-pairs-ii/?envType=daily-question&envId=2024-11-29
 * ☆☆☆☆☆ 2024cvd
 */
public class CountOfPairs2 {
    public static void main(String[] args) {

    }

    public int countOfPairs(int[] nums) {
        int n = nums.length, m = 0, mod = 1000000007;
        for (int num : nums) {
            m = Math.max(m, num);
        }
        int[][] dp = new int[n][m + 1];
        for (int a = 0; a <= nums[0]; a++) {
            dp[0][a] = 1;
        }
        for (int i = 1; i < n; i++) {
            int d = Math.max(0, nums[i] - nums[i - 1]);
            for (int j = d; j <= nums[i]; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j - d];
                } else {
                    dp[i][j] = (dp[i][j - 1] + dp[i - 1][j - d]) % mod;
                }
            }
        }
        int res = 0;
        for (int num : dp[n - 1]) {
            res = (res + num) % mod;
        }
        return res;
    }
}
