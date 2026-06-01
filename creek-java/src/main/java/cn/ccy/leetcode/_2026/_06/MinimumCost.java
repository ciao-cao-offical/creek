package cn.ccy.leetcode._2026._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-cost-of-buying-candies-with-discount/?envType=daily-question&envId=2026-06-01">2144. 打折购买糖果的最小开销</a>
 * @since 2026/6/1 13:12
 */
public class MinimumCost {
    public static void main(String[] args) {

    }

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        int n = cost.length;
        for (int i = n - 1; i >= 0; --i) {
            if ((n - 1 - i) % 3 != 2) {
                res += cost[i];
            }
        }
        return res;
    }
}
