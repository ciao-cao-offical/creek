package com.ciao.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/7
 * @description https://leetcode-cn.com/problems/3sum-closest/
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(new ThreeSumClosest().threeSumClosest(nums, target));
    }

    //排序+双指针
    public int threeSumClosest(int[] nums, int target) {
        int best = 10000000;
        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = nums[i];
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = a + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }

                if (sum > target) {
                    int temp = right - 1;
                    while (left < temp && nums[temp] == nums[right]) {
                        temp--;
                    }
                    right = temp;

                } else {
                    int temp = left + 1;
                    while (temp < right && nums[temp] == nums[left]) {
                        temp++;
                    }
                    left = temp;
                }
            }
        }

        return best;
    }
}
