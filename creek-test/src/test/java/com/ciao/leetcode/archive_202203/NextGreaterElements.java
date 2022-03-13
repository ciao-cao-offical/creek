package com.ciao.leetcode.archive_202203;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/12
 * @description https://leetcode-cn.com/problems/next-greater-element-ii/
 */
public class NextGreaterElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(new NextGreaterElements().nextGreaterElements(nums)));
    }

    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 1) {
            return new int[]{-1};
        }

        int len = nums.length;
        int[] ans = new int[len];
        Arrays.fill(ans, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 2 * len - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % len]) {
                ans[stack.pop()] = nums[i % len];
            }

            stack.push(i % len);
        }
        return ans;
    }
}
