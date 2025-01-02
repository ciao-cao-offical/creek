package cn.ccy.leetcode._2022.archive_202212;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/4 0004
 * @description https://leetcode.cn/problems/closest-dessert-cost/
 * ★★★
 */
public class ClosestCost {
    public static void main(String[] args) {
        int[] baseCosts = {1, 7};
        int[] toppingCosts = {3, 4};
        int target = 10;
        System.out.println(new ClosestCost().closestCost(baseCosts, toppingCosts, target));
    }

    int res;

    //【回溯】参考自：https://leetcode.cn/problems/closest-dessert-cost/solutions/2004210/zui-jie-jin-mu-biao-jie-ge-de-tian-dian-2ck06/
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        res = Arrays.stream(baseCosts).min().orElse(0);
        for (int b : baseCosts) {
            dfs(toppingCosts, 0, b, target);
        }
        return res;
    }

    public void dfs(int[] toppingCosts, int p, int curCost, int target) {
        if (Math.abs(res - target) < curCost - target) {
            return;

        } else if (Math.abs(res - target) >= Math.abs(curCost - target)) {
            if (Math.abs(res - target) > Math.abs(curCost - target)) {
                res = curCost;

            } else {
                res = Math.min(res, curCost);
            }
        }
        if (p == toppingCosts.length) {
            return;
        }

        dfs(toppingCosts, p + 1, curCost + toppingCosts[p] * 2, target);
        dfs(toppingCosts, p + 1, curCost + toppingCosts[p], target);
        dfs(toppingCosts, p + 1, curCost, target);
    }
}
