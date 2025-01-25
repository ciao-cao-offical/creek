package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/25 18:29:07
 * @description https://leetcode.cn/problems/minimum-money-required-before-transactions/?envType=daily-question&envId=2025-01-25
 * ☆☆☆☆☆ 2024cvd
 */
public class MinimumMoney {
    public static void main(String[] args) {

    }

    public long minimumMoney(int[][] transactions) {
        long totalLose = 0;
        int res = 0;
        for (int[] t : transactions) {
            int cost = t[0];
            int cashback = t[1];
            totalLose += Math.max(cost - cashback, 0);
            res = Math.max(res, Math.min(cost, cashback));
        }
        return totalLose + res;
    }
}
