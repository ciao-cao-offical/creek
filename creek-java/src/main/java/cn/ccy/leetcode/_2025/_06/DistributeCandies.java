package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/distribute-candies-among-children-ii/?envType=daily-question&envId=2025-06-01">2929. 给小朋友们分糖果 II</a>
 * @since 2025/6/1 20:55
 */
public class DistributeCandies {
    public static void main(String[] args) {

    }

    public long distributeCandies(int n, int limit) {
        long ans = 0;
        for (int i = 0; i <= Math.min(limit, n); i++) {
            if (n - i > 2 * limit) {
                continue;
            }
            ans += Math.min(n - i, limit) - Math.max(0, n - i - limit) + 1;
        }
        return ans;
    }
}
