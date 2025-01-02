package cn.ccy.leetcode._2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/8 0008 00:05:28
 * @description https://leetcode.cn/problems/maximum-absolute-sum-of-any-subarray/
 */
public class MaxAbsoluteSum {
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};
        System.out.println(new MaxAbsoluteSum().maxAbsoluteSum(nums));
    }

    public int maxAbsoluteSum(int[] nums) {
        int positiveMax = 0, negativeMin = 0;
        int positiveSum = 0, negativeSum = 0;
        for (int num : nums) {
            positiveSum += num;
            positiveMax = Math.max(positiveMax, positiveSum);
            positiveSum = Math.max(0, positiveSum);
            negativeSum += num;
            negativeMin = Math.min(negativeMin, negativeSum);
            negativeSum = Math.min(0, negativeSum);
        }
        return Math.max(positiveMax, -negativeMin);
    }
}
