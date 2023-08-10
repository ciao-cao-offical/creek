package cn.ccy.leetcode.archive_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/5 0005
 * @description https://leetcode.cn/problems/my-calendar-i/
 * ☆☆☆ 试试【平衡树】，【二分查找】和【线段树】
 */
public class MyCalendar {

    public static void main(String[] args) {

    }

    private List<int[]> cals;

    public MyCalendar() {
        cals = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] cal : cals) {
            if (cal[0] < end && cal[1] > start) {
                return false;
            }
        }
        cals.add(new int[]{start, end});
        return true;
    }
}
