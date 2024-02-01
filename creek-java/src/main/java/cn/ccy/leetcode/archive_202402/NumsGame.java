package cn.ccy.leetcode.archive_202402;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/1 0001 23:03:02
 * @description https://leetcode.cn/problems/5TxKeK/?envType=daily-question&envId=2024-02-01
 * ☆☆☆☆☆ cvd
 */
public class NumsGame {
    public static void main(String[] args) {

    }

    public int[] numsGame(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        PriorityQueue<Integer> lower = new PriorityQueue<Integer>((a, b) -> b - a);
        PriorityQueue<Integer> upper = new PriorityQueue<Integer>((a, b) -> a - b);
        final int MOD = 1000000007;
        long lowerSum = 0, upperSum = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i] - i;
            if (lower.isEmpty() || lower.peek() >= x) {
                lowerSum += x;
                lower.offer(x);
                if (lower.size() > upper.size() + 1) {
                    upperSum += lower.peek();
                    upper.offer(lower.peek());
                    lowerSum -= lower.peek();
                    lower.poll();
                }
            } else {
                upperSum += x;
                upper.offer(x);
                if (lower.size() < upper.size()) {
                    lowerSum += upper.peek();
                    lower.offer(upper.peek());
                    upperSum -= upper.peek();
                    upper.poll();
                }
            }
            if ((i + 1) % 2 == 0) {
                res[i] = (int) ((upperSum - lowerSum) % MOD);
            } else {
                res[i] = (int) ((upperSum - lowerSum + lower.peek()) % MOD);
            }
        }
        return res;
    }
}
