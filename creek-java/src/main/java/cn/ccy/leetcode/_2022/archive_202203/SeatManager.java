package cn.ccy.leetcode._2022.archive_202203;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/19 0019
 * @description https://leetcode-cn.com/problems/seat-reservation-manager/
 */
public class SeatManager {
    private PriorityQueue<Integer> queue;

    public SeatManager(int n) {
        queue = new PriorityQueue<>(n);
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
    }

    public static void main(String[] args) {

    }

    public int reserve() {
        if (queue.peek() != null) {
            return queue.poll();
        }
        return -1;
    }

    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}
