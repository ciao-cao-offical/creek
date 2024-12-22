package cn.ccy.leetcode.archive_2023.archive_202302;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/19 0019 22:18:52
 * @description https://leetcode.cn/problems/maximum-average-pass-ratio/
 */
public class MaxAverageRatio {
    public static void main(String[] args) {

    }

    //【优先队列】
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            long v1 = (long) (a[1] - a[0]) * b[1] * (b[1] + 1);
            long v2 = (long) (b[1] - b[0]) * a[1] * (a[1] + 1);
            if (v1 == v2) {
                return 0;
            }
            return v1 < v2 ? 1 : -1;
        });

        for (int[] c : classes) {
            pq.offer(new int[]{c[0], c[1]});
        }

        for (int i = 0; i < extraStudents; i++) {
            int[] poll = pq.poll();
            if (poll == null) {
                break;
            }
            int pass = poll[0];
            int total = poll[1];
            pq.offer(new int[]{pass + 1, total + 1});
        }

        double res = 0;
        int size = pq.size();
        for (int i = 0; i < size; i++) {
            int[] poll = pq.poll();
            if (poll == null) {
                break;
            }
            int pass = poll[0];
            int total = poll[1];
            res += 1.0 * pass / total;
        }

        return res / classes.length;
    }
}
