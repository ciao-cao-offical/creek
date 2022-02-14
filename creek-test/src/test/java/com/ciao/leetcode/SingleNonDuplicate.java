package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/14
 * @description https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 */
public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(new SingleNonDuplicate().singleNonDuplicate(nums));
    }

    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;

            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
