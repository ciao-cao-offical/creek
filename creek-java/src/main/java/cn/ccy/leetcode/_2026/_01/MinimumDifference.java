package cn.ccy.leetcode._2026._01;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-difference-between-highest-and-lowest-of-k-scores/?envType=daily-question&envId=2026-01-25">1984. 学生分数的最小差值</a>
 * @since 2026/1/25 23:21
 */
public class MinimumDifference {
    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }

        return minDiff;
    }
}
