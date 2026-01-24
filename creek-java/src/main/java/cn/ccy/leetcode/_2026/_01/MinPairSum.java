package cn.ccy.leetcode._2026._01;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimize-maximum-pair-sum-in-array/?envType=daily-question&envId=2026-01-24">1877. 数组中最大数对和的最小值</a>
 * @since 2026/1/24 20:13
 */
public class MinPairSum {
    public static void main(String[] args) {

    }

    public int minPairSum(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n / 2; ++i) {
            res = Math.max(res, nums[i] + nums[n - 1 - i]);
        }
        return res;
    }
}
