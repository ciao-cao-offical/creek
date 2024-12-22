package cn.ccy.leetcode.archive_2022.archive_202209;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/12 0012
 * @description https://leetcode.cn/problems/special-array-with-x-elements-greater-than-or-equal-x/
 */
public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0, 4};
        System.out.println(new SpecialArray().specialArray(nums));
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 1; i <= n; ++i) {
            if (nums[i - 1] >= i && (i == n || nums[i] < i)) {
                return i;
            }
        }
        return -1;
    }
}
