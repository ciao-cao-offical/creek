package com.ciao.leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/17
 * @description https://leetcode-cn.com/problems/shuffle-an-array/
 */
public class Solution {
    int[] original;
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
        original = new int[nums.length];
        System.arraycopy(nums, 0, original, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution(nums);
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.reset()));
        System.out.println(Arrays.toString(solution.shuffle()));

    }

    public int[] reset() {
        System.arraycopy(original, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            int j = i + random.nextInt(nums.length - i);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}
