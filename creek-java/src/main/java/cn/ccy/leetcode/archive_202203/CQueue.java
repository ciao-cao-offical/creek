package cn.ccy.leetcode.archive_202203;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/19 0019
 * @description https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class CQueue {
    Deque<Integer> head;
    Deque<Integer> tail;

    public CQueue() {
        head = new ArrayDeque<>();
        tail = new ArrayDeque<>();
    }

    public static void main(String[] args) {

    }

    public void appendTail(int value) {
        tail.push(value);
    }

    public int deleteHead() {
        if (head.isEmpty()) {
            while (!tail.isEmpty()) {
                head.push(tail.pop());
            }
        }
       
        return head.isEmpty() ? -1 : head.pop();
    }
}
