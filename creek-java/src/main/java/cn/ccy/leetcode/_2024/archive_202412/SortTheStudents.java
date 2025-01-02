package cn.ccy.leetcode._2024.archive_202412;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/21 16:22:09
 * @description https://leetcode.cn/problems/sort-the-students-by-their-kth-score/?envType=daily-question&envId=2024-12-21
 */
public class SortTheStudents {
    public static void main(String[] args) {

    }

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (u, v) -> v[k] - u[k]);
        return score;
    }
}
