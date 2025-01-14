package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/14 21:22:57
 * @description https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-i/?envType=daily-question&envId=2025-01-14
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }

        return count;
    }
}
