package cn.ccy.leetcode.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/1 0001 21:37:57
 * @description https://leetcode.cn/problems/check-if-there-is-a-valid-partition-for-the-array/?envType=daily-question&envId=2024-03-01
 * ☆☆☆ 2024cvd，dota2！
 */
public class ValidPartition {
    public static void main(String[] args) {

    }

    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && validTwo(nums[i - 2], nums[i - 1]);
            }
            if (i >= 3) {
                dp[i] = dp[i] || (dp[i - 3] && validThree(nums[i - 3], nums[i - 2], nums[i - 1]));
            }
        }
        return dp[n];
    }

    public boolean validTwo(int num1, int num2) {
        return num1 == num2;
    }

    public boolean validThree(int num1, int num2, int num3) {
        return (num1 == num2 && num1 == num3) || (num1 + 1 == num2 && num2 + 1 == num3);
    }
}
