package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-cost-homecoming-of-a-robot-in-a-grid/?envType=daily-question&envId=2026-04-04">2087. 网格图中机器人回家的最小代价</a>
 * @since 2026/4/4 22:31
 */
public class MinCost {
    public static void main(String[] args) {

    }
    
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int r1 = startPos[0], c1 = startPos[1];
        int r2 = homePos[0], c2 = homePos[1];
        int res = 0;   // 总代价

        // 移动至家所在行，判断行间移动方向并计算对应代价
        if (r2 >= r1) {
            for (int i = r1 + 1; i <= r2; i++) {
                res += rowCosts[i];
            }
        } else {
            for (int i = r2; i < r1; i++) {
                res += rowCosts[i];
            }
        }

        // 移动至家所在位置，判断列间移动方向并计算对应代价
        if (c2 >= c1) {
            for (int i = c1 + 1; i <= c2; i++) {
                res += colCosts[i];
            }
        } else {
            for (int i = c2; i < c1; i++) {
                res += colCosts[i];
            }
        }

        return res;
    }
}
