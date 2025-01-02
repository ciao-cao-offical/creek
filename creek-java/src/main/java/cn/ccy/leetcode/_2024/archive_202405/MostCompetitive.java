package cn.ccy.leetcode._2024.archive_202405;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/24 00:05:25
 * @description https://leetcode.cn/problems/find-the-most-competitive-subsequence/?envType=daily-question&envId=2024-05-24
 * ☆☆☆ 2024cvd
 */
public class MostCompetitive {
    public static void main(String[] args) {

    }

    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && n - i + stack.size() > k && stack.peek() > nums[i]) {
                stack.pop();
            }
            stack.push(nums[i]);
        }
        int[] res = new int[k];
        while (stack.size() > k) {
            stack.pop();
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
