package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.TreeMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/22 0022
 * @description https://leetcode-cn.com/problems/my-calendar-i/
 */
public class MyCalendar {
    //平衡树
    TreeMap<Integer, Integer> map;

    public MyCalendar() {
        map = new TreeMap<>();
    }

    public static void main(String[] args) {

    }

    public boolean book(int start, int end) {
        Integer prev = map.floorKey(start);
        Integer next = map.ceilingKey(start);
        if ((prev == null || map.get(prev) <= start) && (next == null || end <= next)) {
            map.put(start, end);
            return true;
        }

        return false;
    }
}
