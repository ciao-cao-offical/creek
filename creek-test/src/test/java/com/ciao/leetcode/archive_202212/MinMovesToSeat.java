package com.ciao.leetcode.archive_202212;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/31 0031 20:32:29
 * @description https://leetcode.cn/problems/minimum-number-of-moves-to-seat-everyone/
 */
public class MinMovesToSeat {
    public static void main(String[] args) {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        System.out.println(new MinMovesToSeat().minMovesToSeat(seats, students));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        int len = seats.length;
        for (int i = 0; i < len; i++) {
            res += Math.abs(seats[i] - students[i]);
        }

        return res;
    }
}
