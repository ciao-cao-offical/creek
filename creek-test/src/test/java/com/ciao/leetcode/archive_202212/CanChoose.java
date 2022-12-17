package com.ciao.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/17 0017 18:31:26
 * @description https://leetcode.cn/problems/form-array-by-concatenating-subarrays-of-another-array/
 */
public class CanChoose {
    public static void main(String[] args) {
        int[][] groups = {{1, -1, -1}, {3, -2, 0}};
        int[] nums = {1, -1, 0, 1, -1, -1, 3, -2, 0};
        System.out.println(new CanChoose().canChoose(groups, nums));
    }

    //【贪心 + 双指针】
    public boolean canChoose(int[][] groups, int[] nums) {
        int i = 0;
        for (int k = 0; k < nums.length && i < groups.length; ) {
            if (check(groups[i], nums, k)) {
                k += groups[i].length;
                i++;

            } else {
                k++;
            }
        }
        return i == groups.length;
    }

    private boolean check(int[] group, int[] nums, int k) {
        if (k + group.length > nums.length) {
            return false;
        }

        for (int i = 0; i < group.length; i++) {
            if (group[i] != nums[k + i]) {
                return false;
            }
        }
        return true;
    }
}
