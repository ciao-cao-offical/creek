package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.Stack;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/28
 * @description https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    Integer front = null;

    //摊还复杂度
    public MyQueue() {
    }

    public static void main(String[] args) {

    }

    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    public boolean empty() {
        return s2.isEmpty() && s1.isEmpty();
    }
}
