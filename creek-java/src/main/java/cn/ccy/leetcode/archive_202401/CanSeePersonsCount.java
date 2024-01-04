package cn.ccy.leetcode.archive_202401;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/5 0005 00:55:23
 * @description https://leetcode.cn/problems/number-of-visible-people-in-a-queue/?envType=daily-question&envId=2024-01-05
 * ☆☆☆☆☆ 2024cvd
 */
public class CanSeePersonsCount {
    public static void main(String[] args) {

    }

    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int h = heights[i];
            while (!stack.isEmpty() && stack.peek() < h) {
                stack.pop();
                res[i]++;
            }
            if (!stack.isEmpty()) {
                res[i]++;
            }
            stack.push(h);
        }
        return res;
    }
}
