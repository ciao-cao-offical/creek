package cn.ccy.leetcode._2024.archive_202409;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/1 00:09
 * @description https://leetcode.cn/problems/seat-reservation-manager/description/?envType=daily-question&envId=2024-09-30
 */
public class SeatManager {
    public static void main(String[] args) {

    }

    private PriorityQueue<Integer> available;

    public SeatManager(int n) {
        available = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            available.offer(i);
        }
    }

    public int reserve() {
        return available.poll();
    }

    public void unreserve(int seatNumber) {
        available.offer(seatNumber);
    }
}
