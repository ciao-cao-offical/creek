package cn.ccy.leetcode._2023.archive_202312;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/26 0026 00:58:54
 * @description https://leetcode.cn/problems/maximum-students-taking-exam/?envType=daily-question&envId=2023-12-26
 * ☆☆☆☆☆ 2023cvd
 */
public class MaxStudents {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int maxStudents(char[][] seats) {
        int m = seats.length, n = seats[0].length;
        int mx = 0;
        for (int i = 0; i < 1 << n; i++) {
            mx = Math.max(mx, dp(seats, m - 1, i));
        }
        return mx;
    }

    public int dp(char[][] seats, int row, int status) {
        int n = seats[0].length;
        int key = (row << n) + status;
        if (!memo.containsKey(key)) {
            if (!isSingleRowCompliant(seats, status, n, row)) {
                memo.put(key, Integer.MIN_VALUE);
                return Integer.MIN_VALUE;
            }
            int students = Integer.bitCount(status);
            if (row == 0) {
                memo.put(key, students);
                return students;
            }
            int mx = 0;
            for (int upperRowStatus = 0; upperRowStatus < 1 << n; upperRowStatus++) {
                if (isCrossRowsCompliant(status, upperRowStatus, n)) {
                    mx = Math.max(mx, dp(seats, row - 1, upperRowStatus));
                }
            }
            memo.put(key, students + mx);
        }
        return memo.get(key);
    }

    public boolean isSingleRowCompliant(char[][] seats, int status, int n, int row) {
        for (int j = 0; j < n; j++) {
            if (((status >> j) & 1) == 1) {
                if (seats[row][j] == '#') {
                    return false;
                }
                if (j > 0 && ((status >> (j - 1)) & 1) == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isCrossRowsCompliant(int status, int upperRowStatus, int n) {
        for (int j = 0; j < n; j++) {
            if (((status >> j) & 1) == 1) {
                if (j > 0 && ((upperRowStatus >> (j - 1)) & 1) == 1) {
                    return false;
                }
                if (j < n - 1 && ((upperRowStatus >> (j + 1)) & 1) == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
