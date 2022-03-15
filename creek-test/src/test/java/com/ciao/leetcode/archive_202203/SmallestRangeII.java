package com.ciao.leetcode.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/15
 * @description https://leetcode-cn.com/problems/smallest-range-ii/
 * ★★
 */
public class SmallestRangeII {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        int k = 3;
        System.out.println(new SmallestRangeII().smallestRangeII(nums, k));
    }


    //贪心算法
    public int smallestRangeII(int[] nums, int k) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int ans = nums[len - 1] - nums[0];
        for (int i = 0; i < len - 1; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int high = Math.max(nums[len - 1] - k, a + k);
            int low = Math.min(nums[0] + k, b - k);

            ans = Math.min(ans, high - low);
        }
        return ans;
    }
}
