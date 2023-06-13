package com.ciao.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/13 0013 22:27:56
 * @description https://leetcode.cn/problems/number-of-unequal-triplets-in-array/
 */
public class UnequalTriplets {
    public static void main(String[] args) {

    }

    public int unequalTriplets(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
