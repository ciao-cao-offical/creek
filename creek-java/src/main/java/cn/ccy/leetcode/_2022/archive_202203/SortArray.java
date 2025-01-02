package cn.ccy.leetcode._2022.archive_202203;

import java.util.Arrays;
import java.util.Random;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/25 0025
 * @description https://leetcode-cn.com/problems/sort-an-array/
 * ☆☆☆ 尝试一下【堆排序】和【归并排序】
 */
public class SortArray {
    private Random random = new Random();

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        System.out.println(Arrays.toString(new SortArray().sortArray(nums)));
    }

    //快排
    public int[] sortArray(int[] nums) {
        randomQuicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void randomQuicksort(int[] nums, int left, int right) {
        if (left < right) {
            int pos = randomPartition(nums, left, right);
            randomQuicksort(nums, left, pos - 1);
            randomQuicksort(nums, pos + 1, right);
        }
    }

    private int randomPartition(int[] nums, int left, int right) {
        int i = random.nextInt(right - left + 1) + left;
        swap(nums, i, right);
        return partition(nums, left, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, right);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
