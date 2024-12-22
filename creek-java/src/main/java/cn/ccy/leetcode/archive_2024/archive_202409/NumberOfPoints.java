package cn.ccy.leetcode.archive_2024.archive_202409;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/15 12:23:09
 * @description https://leetcode.cn/problems/points-that-intersect-with-cars/?envType=daily-question&envId=2024-09-15
 */
public class NumberOfPoints {
    public static void main(String[] args) {

    }

    public int numberOfPoints(List<List<Integer>> nums) {
        int C = 0;
        for (List<Integer> interval : nums) {
            C = Math.max(C, interval.get(1));
        }

        int[] count = new int[C + 1];
        for (List<Integer> interval : nums) {
            for (int i = interval.get(0); i <= interval.get(1); ++i) {
                ++count[i];
            }
        }

        int ans = 0;
        for (int i = 1; i <= C; ++i) {
            if (count[i] > 0) {
                ++ans;
            }
        }
        return ans;
    }
}
