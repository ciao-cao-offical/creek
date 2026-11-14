package cn.ccy.leetcode._2026._11;

import java.util.List;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-positive-sum-subarray/?envType=daily-question&envId=2026-11-14">3364. 最小正和子数组</a>
 * @since 2026/11/14 20:14
 */
public class MinimumSumSubarray {
    public static void main(String[] args) {

    }

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
        }

        int minSum = Integer.MAX_VALUE;
        for (int length = l; length <= r; length++) {
            for (int start = 0; start + length <= n; start++) {
                int sum = prefixSum[start + length] - prefixSum[start];
                if (sum > 0 && sum < minSum) {
                    minSum = sum;
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}

