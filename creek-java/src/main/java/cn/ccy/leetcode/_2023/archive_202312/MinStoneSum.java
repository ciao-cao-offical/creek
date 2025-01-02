package cn.ccy.leetcode._2023.archive_202312;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/23 0023 20:42:01
 * @description https://leetcode.cn/problems/remove-stones-to-minimize-the-total/?envType=daily-question&envId=2023-12-23
 */
public class MinStoneSum {
    public static void main(String[] args) {

    }
    
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> (b - a));
        for (int pile : piles) {
            pq.offer(pile);
        }
        for (int i = 0; i < k; i++) {
            int pile = pq.poll();
            pile -= pile / 2;
            pq.offer(pile);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
