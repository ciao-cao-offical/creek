package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/4
 * @description https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMin {
    public static void main(String[] args) {
        System.out.println(new FindMin().findMin(new int[]{3, 4, 5, 1, 2}));
    }

    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right) {
            int prov = left + (right - left) / 2;
            if (nums[prov] < nums[right]) {
                right = prov;

            } else {
                left = prov + 1;
            }
        }

        return nums[left];
    }
}
