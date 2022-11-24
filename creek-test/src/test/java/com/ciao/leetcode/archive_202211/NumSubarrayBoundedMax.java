package com.ciao.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/24 0024
 * @description https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/
 */
public class NumSubarrayBoundedMax {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3};
        int left = 2;
        int right = 3;
        System.out.println(new NumSubarrayBoundedMax().numSubarrayBoundedMax(nums, left, right));
    }

    //双指针
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0;
        int len = nums.length;
        int i0 = -1;
        int i1 = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] > right) {
                i0 = i;
            }
            if (nums[i] >= left) {
                i1 = i;
            }

            count += i1 - i0;
        }
        return count;
    }
}
