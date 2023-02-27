package com.ciao.leetcode.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/27
 * @description https://leetcode.cn/problems/decrease-elements-to-make-array-zigzag/
 */
public class MovesToMakeZigzag {
    public static void main(String[] args) {
        int[] nums = {9, 6, 1, 6, 2};
        System.out.println(new MovesToMakeZigzag().movesToMakeZigzag(nums));
    }

    public int movesToMakeZigzag(int[] nums) {
        int[] s = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int left = i > 0 ? nums[i - 1] : Integer.MAX_VALUE;
            int right = i < len - 1 ? nums[i + 1] : Integer.MAX_VALUE;
            s[i % 2] += Math.max(nums[i] - Math.min(left, right) + 1, 0);
        }
        return Math.min(s[0], s[1]);
    }
}
