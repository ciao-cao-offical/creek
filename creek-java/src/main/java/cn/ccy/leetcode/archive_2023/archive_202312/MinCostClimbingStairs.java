package cn.ccy.leetcode.archive_2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/17 0017 19:25:12
 * @description https://leetcode.cn/problems/min-cost-climbing-stairs/?envType=daily-question&envId=2023-12-17
 * ☆☆☆ 2023b2t
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {

    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
