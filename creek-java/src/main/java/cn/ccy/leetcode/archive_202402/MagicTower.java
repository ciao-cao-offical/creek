package cn.ccy.leetcode.archive_202402;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/6 0006 00:27:13
 * @description https://leetcode.cn/problems/p0NxJO/?envType=daily-question&envId=2024-02-06
 */
public class MagicTower {
    public static void main(String[] args) {

    }

    public int magicTower(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int ans = 0;
        long hp = 1, delay = 0;
        for (int num : nums) {
            if (num < 0) {
                pq.offer(num);
            }
            hp += num;
            if (hp <= 0) {
                ++ans;
                int curr = pq.poll();
                delay += curr;
                hp -= curr;
            }
        }
        hp += delay;
        return hp <= 0 ? -1 : ans;
    }
}
