package cn.ccy.leetcode.archive_202412;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/12 00:49:08
 * @description https://leetcode.cn/problems/maximum-spending-after-buying-items/?envType=daily-question&envId=2024-12-12
 * ☆☆☆☆☆ 2024cvd
 */
public class MaxSpending {
    public static void main(String[] args) {

    }

    public long maxSpending(int[][] values) {
        int m = values.length, n = values[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{values[i][n - 1], i, n - 1});
        }

        long ans = 0;
        for (int turn = 1; turn <= m * n; turn++) {
            int[] top = pq.poll();
            int val = top[0], i = top[1], j = top[2];
            ans += (long) val * turn;
            if (j > 0) {
                pq.offer(new int[]{values[i][j - 1], i, j - 1});
            }
        }
        return ans;
    }
}
