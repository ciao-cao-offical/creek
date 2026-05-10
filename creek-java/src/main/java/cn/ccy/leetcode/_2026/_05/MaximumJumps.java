package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-jumps-to-reach-the-last-index/description/?envType=daily-question&envId=2026-05-10">2770. 达到末尾下标所需的最大跳跃次数</a>
 * @since 2026/5/10 11:41
 */
public class MaximumJumps {
    public static void main(String[] args) {

    }

    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, Integer.MIN_VALUE);

        int ans = dfs(0, nums, target, memo);
        return ans < 0 ? -1 : ans;
    }

    private int dfs(int i, int[] nums, int target, int[] memo) {
        int n = nums.length;
        if (i == n - 1) {
            return 0;
        }
        if (memo[i] != Integer.MIN_VALUE) {
            return memo[i];
        }
        int res = Integer.MIN_VALUE;
        for (int j = i + 1; j < n; j++) {
            if (Math.abs(nums[i] - nums[j]) <= target) {
                res = Math.max(res, dfs(j, nums, target, memo) + 1);
            }
        }
        return memo[i] = res;
    }
}
