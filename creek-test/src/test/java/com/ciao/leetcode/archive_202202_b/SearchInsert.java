package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/17
 * @description https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert insert = new SearchInsert();
        System.out.println(insert.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0, right = length - 1;

        if (target <= nums[left]) {
            return left;

        } else if (target == nums[right]) {
            return right;

        } else if (target > nums[right]) {
            return right + 1;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int num = nums[mid];
            if (target == num) {
                return mid;

            } else if (target > num) {
                left = mid + 1;

            } else {
                right = mid;
            }
        }

        return left;
    }
}
