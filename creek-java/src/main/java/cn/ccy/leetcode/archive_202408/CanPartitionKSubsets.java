package cn.ccy.leetcode.archive_202408;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/25 19:47:34
 * @description https://leetcode.cn/problems/partition-to-k-equal-sum-subsets/?envType=daily-question&envId=2024-08-25
 */
public class CanPartitionKSubsets {
    public static void main(String[] args) {

    }

    int[] nums;
    int per, n;
    boolean[] dp;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        this.nums = nums;
        int all = Arrays.stream(nums).sum();
        if (all % k != 0) {
            return false;
        }
        per = all / k;
        Arrays.sort(nums);
        n = nums.length;
        if (nums[n - 1] > per) {
            return false;
        }
        dp = new boolean[1 << n];
        Arrays.fill(dp, true);
        return dfs((1 << n) - 1, 0);
    }

    public boolean dfs(int s, int p) {
        if (s == 0) {
            return true;
        }
        if (!dp[s]) {
            return dp[s];
        }
        dp[s] = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] + p > per) {
                break;
            }
            if (((s >> i) & 1) != 0) {
                if (dfs(s ^ (1 << i), (p + nums[i]) % per)) {
                    return true;
                }
            }
        }
        return false;
    }
}
