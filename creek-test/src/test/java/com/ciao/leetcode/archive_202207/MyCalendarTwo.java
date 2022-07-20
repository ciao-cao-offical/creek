package com.ciao.leetcode.archive_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/19 0019
 * @description https://leetcode.cn/problems/my-calendar-ii/
 * ☆☆☆ cvd，摆烂ing
 */
public class MyCalendarTwo {
    public static void main(String[] args) {

    }

    List<int[]> booked;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        booked = new ArrayList<int[]>();
        overlaps = new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : overlaps) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                return false;
            }
        }
        for (int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }
}
