package cn.ccy.leetcode._2026._07;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-product-of-three-numbers/?envType=daily-question&envId=2026-07-26">628. 三个数的最大乘积</a>
 * @since 2026/7/26 15:57
 */
public class MaximumProduct {
    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}
