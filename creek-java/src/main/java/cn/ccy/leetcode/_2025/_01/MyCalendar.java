package cn.ccy.leetcode._2025._01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/2 21:47:49
 * @description https://leetcode.cn/problems/my-calendar-i/?envType=daily-question&envId=2025-01-02
 */
public class MyCalendar {
    public static void main(String[] args) {

    }

    List<int[]> booked;

    public MyCalendar() {
        booked = new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for (int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if (l < end && start < r) {
                return false;
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }
}
