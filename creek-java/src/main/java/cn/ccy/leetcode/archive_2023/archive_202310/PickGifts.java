package cn.ccy.leetcode.archive_2023.archive_202310;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/28 0028 22:49:40
 * @description https://leetcode.cn/problems/take-gifts-from-the-richest-pile/?envType=daily-question&envId=2023-10-28
 */
public class PickGifts {
    public static void main(String[] args) {

    }

    // 优先级队列
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            queue.offer(gift);
        }

        while (k > 0) {
            k--;
            queue.offer((int) Math.sqrt(queue.poll()));
        }

        long res = 0;
        while (!queue.isEmpty()) {
            res += queue.poll();
        }

        return res;
    }
}
