package com.ciao.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/22
 * @description https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(new NextGreaterElement().nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!deque.isEmpty() && deque.peek() < num) {
                deque.pop();
            }
            map.put(num, deque.isEmpty() ? -1 : deque.peek());
            deque.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
