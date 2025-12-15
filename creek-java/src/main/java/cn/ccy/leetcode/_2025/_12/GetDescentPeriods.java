package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-smooth-descent-periods-of-a-stock/?envType=daily-question&envId=2025-12-15">2110. 股票平滑下跌阶段的数目</a>
 * @since 2025/12/15 22:40
 */
public class GetDescentPeriods {
    public static void main(String[] args) {

    }

    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long res = 1;   // 平滑下降阶段的总数，初值为 dp[0]
        int prev = 1;   // 上一个元素为结尾的平滑下降阶段的总数，初值为 dp[0]
        // 从 1 开始遍历数组，按照递推式更新 prev 以及总数 res
        for (int i = 1; i < n; ++i) {
            if (prices[i] == prices[i - 1] - 1) {
                ++prev;
            } else {
                prev = 1;
            }
            res += prev;
        }
        return res;
    }
}
