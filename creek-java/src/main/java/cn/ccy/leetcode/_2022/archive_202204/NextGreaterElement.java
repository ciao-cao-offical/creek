package cn.ccy.leetcode._2022.archive_202204;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/19
 * @description https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(new NextGreaterElement().nextGreaterElement(nums1, nums2)));
    }

    //单调栈
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int len2 = nums2.length;
        for (int i = len2 - 1; i >= 0; i--) {
            int cur = nums2[i];
            while (!stack.isEmpty() && cur > stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                map.put(cur, -1);

            } else {
                map.put(cur, stack.peek());
            }

            stack.addFirst(cur);
        }
        int len1 = nums1.length;
        int[] ans = new int[len1];
        for (int i = 0; i < len1; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
