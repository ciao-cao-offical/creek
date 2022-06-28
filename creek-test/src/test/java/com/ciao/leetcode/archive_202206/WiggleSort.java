package com.ciao.leetcode.archive_202206;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/28
 * @description https://leetcode.cn/problems/wiggle-sort-ii/
 * cvd...看得我有点迷...b2t
 */
public class WiggleSort {

    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 1, 6, 4};
        new WiggleSort().wiggleSort(nums);
    }

    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if (i + 1 < n) {
                nums[i + 1] = arr[k];
            }
        }
    }
}
