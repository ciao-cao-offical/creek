package cn.ccy.leetcode._2022.archive_202205;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/21 0021
 * @description https://leetcode.cn/problems/n-repeated-element-in-size-2n-array/
 * 试试【数学】和【随机选择】-秀!
 */
public class RepeatedNTimes {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(new RepeatedNTimes().repeatedNTimes(nums));
    }

    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
