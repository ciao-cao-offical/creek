package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-highest-altitude/?envType=daily-question&envId=2026-06-19">1732. 找到最高海拔</a>
 * @since 2026/6/19 00:37
 */
public class LargestAltitude {
    public static void main(String[] args) {

    }

    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int x : gain) {
            sum += x;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
