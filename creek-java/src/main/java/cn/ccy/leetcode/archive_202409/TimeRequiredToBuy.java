package cn.ccy.leetcode.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/29 21:08
 * @description https://leetcode.cn/problems/time-needed-to-buy-tickets/?envType=daily-question&envId=2024-09-29
 */
public class TimeRequiredToBuy {
    public static void main(String[] args) {

    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            // 遍历计算每个人所需时间
            if (i <= k) {
                res += Math.min(tickets[i], tickets[k]);
            } else {
                res += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return res;
    }
}
