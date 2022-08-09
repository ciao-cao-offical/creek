package com.ciao.leetcode.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/9
 * @description https://leetcode.cn/problems/minimum-value-to-get-positive-step-by-step-sum/
 */
public class MinStartValue {
    public static void main(String[] args) {
        int[] nums = {-3, 2, -3, 4, 2};
        System.out.println(new MinStartValue().minStartValue(nums));
    }

    public int minStartValue(int[] nums) {
        int accSum = 0;
        int accSumMin = 0;
        for (int num : nums) {
            accSum += num;
            accSumMin = Math.min(accSumMin, accSum);
        }
        return -accSumMin + 1;
    }
}
