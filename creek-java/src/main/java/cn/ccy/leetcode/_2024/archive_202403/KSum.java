package cn.ccy.leetcode._2024.archive_202403;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/9 0009 12:30:45
 * @description https://leetcode.cn/problems/find-the-k-sum-of-an-array/?envType=daily-question&envId=2024-03-09
 * ☆☆☆☆☆ 2024cvd
 */
public class KSum {
    public static void main(String[] args) {

    }

    public long kSum(int[] nums, int k) {
        int n = nums.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                total += nums[i];
            } else {
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);

        long ret = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<long[]>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{nums[0], 0});
        for (int j = 2; j <= k; j++) {
            long[] arr = pq.poll();
            long t = arr[0];
            int i = (int) arr[1];
            ret = t;
            if (i == n - 1) {
                continue;
            }
            pq.offer(new long[]{t + nums[i + 1], i + 1});
            pq.offer(new long[]{t - nums[i] + nums[i + 1], i + 1});
        }
        return total - ret;
    }
}
