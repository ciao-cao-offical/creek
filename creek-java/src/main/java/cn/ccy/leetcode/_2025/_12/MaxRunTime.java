package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-running-time-of-n-computers/?envType=daily-question&envId=2025-12-01">2141. 同时运行 N 台电脑的最长时间</a>
 * @since 2025/12/1 21:23
 * ☆☆☆☆☆ 2025cvd
 */
public class MaxRunTime {
    public static void main(String[] args) {

    }

    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int cap : batteries) {
            sum += cap;
        }

        long left = 0, right = sum / n, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = 0;
            for (int cap : batteries) {
                total += Math.min(cap, mid);
            }
            if (total >= n * mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
