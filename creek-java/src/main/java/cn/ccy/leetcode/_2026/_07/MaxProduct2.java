package cn.ccy.leetcode._2026._07;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/?envType=daily-question&envId=2026-07-27">1464. 数组中两元素的最大乘积</a>
 * @since 2026/7/27 01:17
 */
public class MaxProduct2 {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
