package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/4
 * @description https://leetcode-cn.com/problems/find-peak-element/
 */
public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(new FindPeakElement().findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    public int findPeakElement(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[ans]) {
                ans = i;
            }
        }
        return ans;
    }
}
