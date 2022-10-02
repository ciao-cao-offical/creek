package com.ciao.leetcode.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/2 0002
 * @description https://leetcode.cn/problems/swap-adjacent-in-lr-string/
 */
public class CanTransform {
    public static void main(String[] args) {
        String start = "RXXLRXRXL", end = "XRLXXRRLX";
        System.out.println(new CanTransform().canTransform(start, end));
    }

    //
    public boolean canTransform(String start, String end) {
        int n = start.length(), i = 0, j = 0;
        while (i < n || j < n) {
            while (i < n && start.charAt(i) == 'X') i++;
            while (j < n && end.charAt(j) == 'X') j++;
            if (i == n || j == n) {
                return i == j;
            }
            if (start.charAt(i) != end.charAt(j)) {
                return false;
            }
            if (start.charAt(i) == 'L' && i < j) {
                return false;
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
}
