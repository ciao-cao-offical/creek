package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/28 0028
 * @description https://leetcode-cn.com/problems/trapping-rain-water/
 * ☆☆☆ 试试【单调栈】和【双指针】
 */
public class Trap {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(new Trap().trap(height));
    }

    //动态规划
    public int trap(int[] height) {
        int len = height.length;
        if (len == 1) {
            return 0;
        }

        int[] leftMax = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i <= len - 1; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[len];
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }
}
