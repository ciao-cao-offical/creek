package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-penalty-for-a-shop/?envType=daily-question&envId=2025-12-26">2483. 商店的最少代价</a>
 * @since 2025/12/26 00:06
 */
public class BestClosingTime {
    public static void main(String[] args) {

    }

    public int bestClosingTime(String customers) {
        int n = customers.length();
        int suf = 0;
        int pre = 0;
        int minCost = 0;
        int res = 0;

        for (int i = 0; i <= n; i++) {
            if (minCost > suf + pre) {
                minCost = suf + pre;
                res = i;
            }
            if (i < n && customers.charAt(i) == 'N') {
                pre++;
            } else if (i < n) {
                suf--;
            }
        }
        return res;
    }
}
