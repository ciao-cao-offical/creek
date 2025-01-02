package cn.ccy.leetcode._2022.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/28 0028
 * @description https://leetcode-cn.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(nums)));
    }

    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            while (left < right && nums[right] % 2 == 1) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
