package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/reschedule-meetings-for-maximum-free-time-ii/?envType=daily-question&envId=2025-07-10">3440. 重新安排会议得到最多空余时间 II</a>
 * @since 2025/7/10 22:13
 */
public class MaxFreeTime2 {
    public static void main(String[] args) {

    }

    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        boolean[] q = new boolean[n];
        for (int i = 0, t1 = 0, t2 = 0; i < n; i++) {
            if (endTime[i] - startTime[i] <= t1) {
                q[i] = true;
            }
            t1 = Math.max(t1, startTime[i] - (i == 0 ? 0 : endTime[i - 1]));

            if (endTime[n - i - 1] - startTime[n - i - 1] <= t2) {
                q[n - i - 1] = true;
            }
            t2 = Math.max(t2, (i == 0 ? eventTime : startTime[n - i]) - endTime[n - i - 1]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : endTime[i - 1];
            int right = i == n - 1 ? eventTime : startTime[i + 1];
            if (q[i]) {
                res = Math.max(res, right - left);
            } else {
                res = Math.max(res, right - left - (endTime[i] - startTime[i]));
            }
        }
        return res;
    }
}
