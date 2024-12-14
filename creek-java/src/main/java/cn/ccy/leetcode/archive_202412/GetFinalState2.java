package cn.ccy.leetcode.archive_202412;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/14 23:55:40
 * @description https://leetcode.cn/problems/final-array-state-after-k-multiplication-operations-ii/?envType=daily-question&envId=2024-12-14
 * ☆☆☆☆☆ 2024cvd
 */
public class GetFinalState2 {
    public static void main(String[] args) {

    }

    private long quickMul(long x, long y, long m) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % m;
            }
            y >>= 1;
            x = (x * x) % m;
        }
        return res;
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        if (multiplier == 1) {
            return nums;
        }
        int n = nums.length, mx = 0;
        long m = 1000000007L;
        PriorityQueue<long[]> v = new PriorityQueue<>((x, y) -> {
            if (x[0] != y[0]) {
                return Long.compare(x[0], y[0]);
            } else {
                return Long.compare(x[1], y[1]);
            }
        });
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            v.offer(new long[]{nums[i], i});
        }
        for (; v.peek()[0] < mx && k > 0; k--) {
            long[] x = v.poll();
            x[0] *= multiplier;
            v.offer(x);
        }
        for (int i = 0; i < n; i++) {
            long[] x = v.poll();
            int t = k / n + (i < k % n ? 1 : 0);
            nums[(int) x[1]] = (int) ((x[0] % m) * quickMul(multiplier, t, m) % m);
        }
        return nums;
    }
}
