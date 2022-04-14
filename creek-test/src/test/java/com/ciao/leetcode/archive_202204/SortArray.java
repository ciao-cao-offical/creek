package com.ciao.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/14
 * @description https://leetcode-cn.com/problems/sort-an-array/
 * ☆☆☆☆ 再试试性能更好一些的【快排】，【归并排序】和【堆排序】
 */
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        System.out.println(Arrays.toString(new SortArray().sortArray(nums)));
    }

    //快排 可替换为随机选中pivot
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int partition = partition(nums, left, right);
            quickSort(nums, left, partition - 1);
            quickSort(nums, partition + 1, right);
        }

        return nums;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, i, index);
                index++;
            }
        }

        swap(nums, pivot, index - 1);
        return index - 1;
    }

    private void swap(int[] nums, int pivot, int index) {
        int temp = nums[pivot];
        nums[pivot] = nums[index];
        nums[index] = temp;
    }
}
