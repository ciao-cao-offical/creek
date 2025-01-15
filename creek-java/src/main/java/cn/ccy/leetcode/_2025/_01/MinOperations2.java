package cn.ccy.leetcode._2025._01;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/15 23:04:40
 * @description https://leetcode.cn/problems/minimum-operations-to-exceed-threshold-value-ii/?envType=daily-question&envId=2025-01-15
 */
public class MinOperations2 {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums, int k) {
        int res = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) {
            pq.offer(num);
        }
        while (pq.peek() < k) {
            long x = pq.poll(), y = pq.poll();
            pq.offer(x + x + y);
            res++;
        }
        return res;
    }
}
