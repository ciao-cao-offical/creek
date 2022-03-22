package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/22 0022
 * @description https://leetcode-cn.com/problems/design-circular-queue/
 */
public class MyCircularQueue {
    private int[] queue;
    private int headIndex;
    private int count;
    private int capacity;

    //数组实现
    public MyCircularQueue(int k) {
        queue = new int[k];
        headIndex = 0;
        count = 0;
        capacity = k;
    }

    public static void main(String[] args) {

    }

    public boolean enQueue(int value) {
        if (count == capacity) {
            return false;
        }

        queue[(headIndex + count) % capacity] = value;
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if (count == 0) {
            return false;
        }

        headIndex = (headIndex + 1) % capacity;
        count--;
        return true;
    }

    public int Front() {
        if (count == 0) {
            return -1;
        }

        return queue[headIndex];
    }

    public int Rear() {
        if (count == 0) {
            return -1;
        }

        return queue[(headIndex + count - 1) % capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}
