package cn.ccy.leetcode._2022.archive_202203;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/20 0020
 * @description https://leetcode-cn.com/problems/min-stack/
 */
public class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    //辅助栈
    public MinStack() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public static void main(String[] args) {

    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.isEmpty() ? Integer.MAX_VALUE : minStack.peek(), val));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.isEmpty() ? 0 : xStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? 0 : minStack.peek();
    }
}
