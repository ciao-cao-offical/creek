package cn.ccy.leetcode.archive_202310;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/18 0018 01:05:22
 * @description https://leetcode.cn/problems/maximal-score-after-applying-k-operations/?envType=daily-question&envId=2023-10-18
 */
public class MaxKelements {
    public static void main(String[] args) {

    }

    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int num : nums) {
            q.offer(num);
        }
        long ans = 0;
        for (int i = 0; i < k; ++i) {
            int x = q.poll();
            ans += x;
            q.offer((x + 2) / 3);
        }
        return ans;
    }
}
