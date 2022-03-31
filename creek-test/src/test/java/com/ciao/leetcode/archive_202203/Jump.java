package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/31
 * @description https://leetcode-cn.com/problems/jump-game-ii/
 */
public class Jump {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(new Jump().jump(nums));
    }

    //正向查找
    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < len - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
