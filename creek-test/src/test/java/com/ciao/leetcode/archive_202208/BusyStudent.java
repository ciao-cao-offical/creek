package com.ciao.leetcode.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/19 0019
 * @description https://leetcode.cn/problems/number-of-students-doing-homework-at-a-given-time/
 * 试试【差分数组】
 */
public class BusyStudent {
    public static void main(String[] args) {

    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                res++;
            }
        }
        return res;
    }
}
