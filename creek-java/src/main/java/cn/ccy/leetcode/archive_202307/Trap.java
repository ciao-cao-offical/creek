package cn.ccy.leetcode.archive_202307;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/23 0023 19:37:10
 * @description https://leetcode.cn/problems/trapping-rain-water/
 * ☆☆☆☆☆ cvd
 */
public class Trap {
    public static void main(String[] args) {

    }

    // 单调栈：https://leetcode.cn/problems/trapping-rain-water/solutions/692342/jie-yu-shui-by-leetcode-solution-tuvc/
    public int trap(int[] height) {
        int ans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        int n = height.length;
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                ans += currWidth * currHeight;
            }
            stack.push(i);
        }
        return ans;
    }
}
