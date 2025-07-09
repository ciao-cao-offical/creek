package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/reschedule-meetings-for-maximum-free-time-i/?envType=daily-question&envId=2025-07-09">3439. 重新安排会议得到最多空余时间 I</a>
 * @since 2025/7/9 23:03
 */
public class MaxFreeTime {
    public static void main(String[] args) {

    }

    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length, res = 0;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + endTime[i] - startTime[i];
        }
        for (int i = k - 1; i < n; i++) {
            int right = i == n - 1 ? eventTime : startTime[i + 1];
            int left = i == k - 1 ? 0 : endTime[i - k];
            res = Math.max(res, right - left - (sum[i + 1] - sum[i - k + 1]));
        }
        return res;
    }
}
