package cn.ccy.leetcode._2023.archive_202307;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/25 0025 00:48:47
 * @description https://leetcode.cn/problems/minimum-operations-to-halve-array-sum/
 */
public class HalveArray {
    public static void main(String[] args) {
        int[] nums = {5, 19, 8, 1};
        System.out.println(new HalveArray().halveArray(nums));
    }

    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> b.compareTo(a));
        for (int num : nums) {
            pq.offer((double) num);
        }
        int res = 0;
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double sum2 = 0.0;
        while (sum2 < sum / 2) {
            double x = pq.poll();
            sum2 += x / 2;
            pq.offer(x / 2);
            res++;
        }
        return res;
    }

    // 错误示范... mdd...
    /*public int halveArray(int[] nums) {
        int count = 0;
        double sum = Arrays.stream(nums).sum();
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> (int) (b - a));
        for (int num : nums) {
            pq.offer((double) num);
        }

        double temp = sum;
        while (temp > sum / 2 && !pq.isEmpty()) {
            Double poll = pq.poll();
            double half = poll / 2;
            temp -= half;
            pq.offer(half);
            count++;
        }
        return count;
    }*/
}
