package cn.ccy.leetcode.archive_2024.archive_202409;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/13 00:51:33
 * @description https://leetcode.cn/problems/maximum-number-of-robots-within-budget/?envType=daily-question&envId=2024-09-13
 * ☆☆☆☆☆ 2024cvd
 */
public class MaximumRobots {
    public static void main(String[] args) {

    }

    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int res = 0, n = chargeTimes.length;
        long runningCostSum = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0, j = 0; i < n; i++) {
            runningCostSum += runningCosts[i];
            while (!q.isEmpty() && chargeTimes[q.peekLast()] <= chargeTimes[i]) {
                q.pollLast();
            }
            q.addLast(i);
            while (j <= i && (i - j + 1) * runningCostSum + chargeTimes[q.peekFirst()] > budget) {
                if (!q.isEmpty() && q.peekFirst() == j) {
                    q.pollFirst();
                }
                runningCostSum -= runningCosts[j];
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
