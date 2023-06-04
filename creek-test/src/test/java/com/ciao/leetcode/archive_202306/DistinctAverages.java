package com.ciao.leetcode.archive_202306;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/4 0004 16:25:51
 * @description https://leetcode.cn/problems/number-of-distinct-averages/
 */
public class DistinctAverages {
    public static void main(String[] args) {

    }

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0d;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}
