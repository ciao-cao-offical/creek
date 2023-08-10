package cn.ccy.leetcode.archive_202209;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/11
 * @description https://leetcode.cn/problems/minimum-cost-to-hire-k-workers/
 * ⭐️⭐️⭐️⭐️⭐️ cvd
 */
public class MincostToHireWorkers {
    public static void main(String[] args) {

    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = i;
        }
        Arrays.sort(h, (a, b) -> {
            return quality[b] * wage[a] - quality[a] * wage[b];
        });
        double res = 1e9;
        double totalq = 0.0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i = 0; i < k - 1; i++) {
            totalq += quality[h[i]];
            pq.offer(quality[h[i]]);
        }
        for (int i = k - 1; i < n; i++) {
            int idx = h[i];
            totalq += quality[idx];
            pq.offer(quality[idx]);
            double totalc = ((double) wage[idx] / quality[idx]) * totalq;
            res = Math.min(res, totalc);
            totalq -= pq.poll();
        }
        return res;
    }
}
