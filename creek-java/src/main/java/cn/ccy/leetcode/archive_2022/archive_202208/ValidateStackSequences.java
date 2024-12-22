package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.Stack;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/31 0031
 * @description https://leetcode.cn/problems/validate-stack-sequences/
 */
public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {2, 3, 0, 1};
        int[] popped = {0, 3, 2, 1};
        System.out.println(new ValidateStackSequences().validateStackSequences(pushed, popped));
    }

    //模拟
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int p : pushed) {
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                ++i;
                stack.pop();
            }

            if (p == popped[i]) {
                ++i;

            } else {
                stack.push(p);
            }
        }

        for (; i < popped.length; i++) {
            Integer pop = stack.pop();
            if (pop != popped[i]) {
                return false;
            }
        }

        return true;
    }
}
