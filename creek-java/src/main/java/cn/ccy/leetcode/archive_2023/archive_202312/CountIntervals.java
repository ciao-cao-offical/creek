package cn.ccy.leetcode.archive_2023.archive_202312;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/16 0016 22:58:47
 * @description https://leetcode.cn/problems/count-integers-in-intervals/?envType=daily-question&envId=2023-12-16
 * ☆☆☆☆☆ cvd
 */
public class CountIntervals {
    public static void main(String[] args) {

    }

    TreeMap<Integer, Integer> map = new TreeMap<>();
    int cnt = 0;

    public CountIntervals() {

    }

    public void add(int left, int right) {
        Map.Entry<Integer, Integer> interval = map.floorEntry(right);
        while (interval != null && interval.getValue() >= left) {
            int l = interval.getKey(), r = interval.getValue();
            left = Math.min(left, l);
            right = Math.max(right, r);
            cnt -= r - l + 1;
            map.remove(l);
            interval = map.floorEntry(right);
        }
        cnt += (right - left + 1);
        map.put(left, right);
    }

    public int count() {
        return cnt;
    }
}
