package cn.ccy.leetcode._2025._07;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-difference-in-sums-after-removal-of-elements/?envType=daily-question&envId=2025-07-18">2163. 删除元素后和的最小差值</a>
 * @since 2025/7/18 23:27
 * ★★★★★ 2025cvd
 */
public class MinimumDifference {
    public static void main(String[] args) {

    }

    public long minimumDifference(int[] nums) {
        int n3 = nums.length, n = n3 / 3;
        long[] part1 = new long[n + 1];
        long sum = 0;
        // 大根堆（用相反数模拟）
        PriorityQueue<Integer> ql = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; ++i) {
            sum += nums[i];
            ql.add(nums[i]);
        }
        part1[0] = sum;
        for (int i = n; i < n * 2; ++i) {
            sum += nums[i];
            ql.add(nums[i]);
            sum -= ql.poll();
            part1[i - (n - 1)] = sum;
        }

        long part2 = 0;
        // 小根堆
        PriorityQueue<Integer> qr = new PriorityQueue<>();
        for (int i = n * 3 - 1; i >= n * 2; --i) {
            part2 += nums[i];
            qr.add(nums[i]);
        }
        long ans = part1[n] - part2;
        for (int i = n * 2 - 1; i >= n; --i) {
            part2 += nums[i];
            qr.add(nums[i]);
            part2 -= qr.poll();
            ans = Math.min(ans, part1[i - n] - part2);
        }
        return ans;
    }
}
