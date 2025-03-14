package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/28 01:12:49
 * @description https://leetcode.cn/problems/find-the-count-of-monotonic-pairs-i/submissions/583601782/?envType=daily-question&envId=2024-11-28
 * ☆☆☆☆☆ 2024cvd
 */
public class CountOfPairs {
    public static void main(String[] args) {

    }

    public int countOfPairs(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][51];
        int mod = 1000000007;
        for (int v = 0; v <= nums[0]; v++) {
            dp[0][v] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int v2 = 0; v2 <= nums[i]; v2++) {
                for (int v1 = 0; v1 <= v2; v1++) {
                    if (nums[i - 1] - v1 >= nums[i] - v2 && nums[i] - v2 >= 0) {
                        dp[i][v2] = (dp[i][v2] + dp[i - 1][v1]) % mod;
                    }
                }
            }
        }

        int res = 0;
        for (int v : dp[n - 1]) {
            res = (res + v) % mod;
        }
        return res;
    }
}
