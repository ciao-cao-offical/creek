package com.ciao.leetcode.archive_202204;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/19
 * @description https://leetcode-cn.com/problems/132-pattern/
 * ☆☆☆ 试试枚举方法【枚举 3】，【枚举 1】和【枚举 2】
 */
public class Find132pattern {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        System.out.println(new Find132pattern().find132pattern(nums));
    }

    //单调栈
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }

        //i < j < k && nums[i] < nums[k] < nums[j]
        int k = Integer.MIN_VALUE;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = len - 1; i >= 0; i--) {
            int cur = nums[i];
            if (cur < k) {
                return true;
            }

            while (!stack.isEmpty() && cur > stack.peek()) {
                k = Math.max(k, stack.pop());
            }
            stack.push(cur);
        }
        return false;
    }
}
