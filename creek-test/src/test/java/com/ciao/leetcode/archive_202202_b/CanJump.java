package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description https://leetcode-cn.com/problems/jump-game/
 */
public class CanJump {
    public static void main(String[] args) {
        System.out.println(new CanJump().canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightMost = 0;
        for (int i = 0; i < len; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);

            } else {
                break;
            }
            if (rightMost >= len - 1) {
                return true;
            }
        }

        return false;
    }
}
