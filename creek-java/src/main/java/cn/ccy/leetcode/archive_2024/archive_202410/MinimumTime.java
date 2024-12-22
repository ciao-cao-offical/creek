package cn.ccy.leetcode.archive_2024.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/5 18:37:11
 * @description https://leetcode.cn/problems/minimum-time-to-complete-trips/?envType=daily-question&envId=2024-10-05
 */
public class MinimumTime {
    public static void main(String[] args) {

    }

    public long minimumTime(int[] time, int totalTrips) {
        // 二分查找下界与上界
        long l = 1;
        long r = (long) totalTrips * Arrays.stream(time).max().orElse(0);
        // 二分查找寻找满足要求的最小的 t
        while (l < r) {
            long mid = l + (r - l) / 2;
            if (check(mid, time, totalTrips)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // 判断 t 时间内是否可以完成 totalTrips 趟旅途
    public boolean check(long t, int[] time, int totalTrips) {
        long cnt = 0;
        for (int period : time) {
            cnt += t / period;
        }
        return cnt >= totalTrips;
    }
}
