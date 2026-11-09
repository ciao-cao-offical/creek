package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/climbing-stairs-ii/description/?envType=daily-question&envId=2026-11-10">3693. 爬楼梯 II</a>
 * @since 2026/11/10 01:31
 */
public class ClimbStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n, int[] costs) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; ++i) {
            int nxt = Math.min(Math.min(a + 9, b + 4), c + 1) + costs[i];
            a = b;
            b = c;
            c = nxt;
        }
        return c;
    }
}
