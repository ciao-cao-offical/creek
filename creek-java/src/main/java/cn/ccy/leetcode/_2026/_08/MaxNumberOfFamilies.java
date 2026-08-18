package cn.ccy.leetcode._2026._08;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/cinema-seat-allocation/description/?envType=daily-question&envId=2026-08-19">1386. 安排电影院座位</a>
 * @since 2026/8/19 01:23
 */
public class MaxNumberOfFamilies {
    public static void main(String[] args) {

    }

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int left = 0b11110000;
        int middle = 0b11000011;
        int right = 0b00001111;

        Map<Integer, Integer> occupied = new HashMap<Integer, Integer>();
        for (int[] seat : reservedSeats) {
            if (seat[1] >= 2 && seat[1] <= 9) {
                int origin = occupied.containsKey(seat[0]) ? occupied.get(seat[0]) : 0;
                int value = origin | (1 << (seat[1] - 2));
                occupied.put(seat[0], value);
            }
        }

        int ans = (n - occupied.size()) * 2;
        for (Map.Entry<Integer, Integer> entry : occupied.entrySet()) {
            int row = entry.getKey(), bitmask = entry.getValue();
            if (((bitmask | left) == left) || ((bitmask | middle) == middle) || ((bitmask | right) == right)) {
                ++ans;
            }
        }
        return ans;
    }
}
