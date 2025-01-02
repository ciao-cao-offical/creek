package cn.ccy.leetcode._2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/2
 * @description https://leetcode.cn/problems/design-circular-queue/
 */
public class MyCircularQueue {
    public static void main(String[] args) {

    }

    private int[] elements;
    private int head;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        elements = new int[capacity];
        head = 0;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        elements[(head + count) % capacity] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return elements[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return elements[(head + count - 1) % capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
