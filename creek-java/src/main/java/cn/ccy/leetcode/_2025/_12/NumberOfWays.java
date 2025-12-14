package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-ways-to-divide-a-long-corridor/?envType=daily-question&envId=2025-12-14">2147. 分隔长廊的方案数</a>
 * @since 2025/12/14 13:20
 * ☆☆☆☆☆ 2025cvd
 */
public class NumberOfWays {
    public static void main(String[] args) {

    }

    private static final int mod = 1000000007;

    public int numberOfWays(String corridor) {
        int n = corridor.length();
        int prev = -1, cnt = 0, ans = 1;
        for (int i = 0; i < n; ++i) {
            if (corridor.charAt(i) == 'S') {
                ++cnt;
                if (cnt >= 3 && cnt % 2 == 1) {
                    ans = (int) ((long) ans * (i - prev) % mod);
                }
                prev = i;
            }
        }
        if (cnt < 2 || cnt % 2 != 0) {
            ans = 0;
        }
        return ans;
    }
}
