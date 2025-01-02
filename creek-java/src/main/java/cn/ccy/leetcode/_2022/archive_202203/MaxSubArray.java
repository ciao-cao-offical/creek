package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/23 0023
 * @description https://leetcode-cn.com/problems/maximum-subarray/
 * ☆ 尝试一下【分治算法】
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSubArray().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxSubSum = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxSubSum = Math.max(maxSubSum, pre);
        }

        return maxSubSum;
    }
}
