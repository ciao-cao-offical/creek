package cn.ccy.leetcode._2025._01;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/4 22:14:37
 * @description https://leetcode.cn/problems/my-calendar-iii/?envType=daily-question&envId=2025-01-04
 * ☆☆☆☆☆ 2024cvd
 */
public class MyCalendarThree {
    public static void main(String[] args) {

    }

    private TreeMap<Integer, Integer> cnt;

    public MyCalendarThree() {
        cnt = new TreeMap<Integer, Integer>();
    }

    public int book(int start, int end) {
        int ans = 0;
        int maxBook = 0;
        cnt.put(start, cnt.getOrDefault(start, 0) + 1);
        cnt.put(end, cnt.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int freq = entry.getValue();
            maxBook += freq;
            ans = Math.max(maxBook, ans);
        }
        return ans;
    }
}
