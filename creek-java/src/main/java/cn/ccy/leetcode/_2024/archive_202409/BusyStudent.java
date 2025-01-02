package cn.ccy.leetcode._2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/1 22:47:53
 * @description https://leetcode.cn/problems/number-of-students-doing-homework-at-a-given-time/?envType=daily-question&envId=2024-09-01
 */
public class BusyStudent {
    public static void main(String[] args) {

    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                ans++;
            }
        }
        return ans;
    }
}
