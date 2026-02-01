package cn.ccy.leetcode._2026._02;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/divide-an-array-into-subarrays-with-minimum-cost-i/?envType=daily-question&envId=2026-02-01">3010. 将数组分成最小总代价的子数组 I</a>
 * @since 2026/2/1 22:55
 */
public class MinimumCost {
    public static void main(String[] args) {

    }

    public int minimumCost(int[] nums) {
        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }
}
