package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/26 0026
 * @description https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * ☆☆☆☆☆ 尝试一下【二分查找】和【划分数组】
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        System.out.println(new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len_1 = nums1.length;
        int len_2 = nums2.length;
        if (len_1 > len_2) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int totalLeft = (len_1 + len_2 + 1) / 2;

        int left = 0;
        int right = len_1;
        while (left < right) {
            int i = left + (right - left + 1) / 2;
            int j = totalLeft - i;
            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;

            } else {
                left = i;
            }
        }

        int i = left;
        int j = totalLeft - i;
        int nums1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1RightMin = i == len_1 ? Integer.MAX_VALUE : nums1[i];
        int nums2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2RightMin = j == len_2 ? Integer.MAX_VALUE : nums2[j];
        if ((len_1 + len_2) % 2 == 1) {
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double) (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2;
        }
    }
}
