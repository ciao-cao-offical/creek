package cn.ccy.leetcode._2024.archive_202405;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/15 00:38:06
 * @description https://leetcode.cn/problems/minimum-time-to-complete-all-tasks/?envType=daily-question&envId=2024-05-15
 * ☆☆☆☆☆ 2024cvd
 */
public class FindMinimumTime {
    public static void main(String[] args) {

    }

    public int findMinimumTime(int[][] tasks) {
        int n = tasks.length;
        Arrays.sort(tasks, (a, b) -> a[1] - b[1]);
        int[] run = new int[tasks[n - 1][1] + 1];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int start = tasks[i][0], end = tasks[i][1], duration = tasks[i][2];
            for (int j = start; j <= end; j++) {
                duration -= run[j];
            }
            res += Math.max(duration, 0);
            for (int j = end; j >= 0 && duration > 0; j--) {
                if (run[j] == 0) {
                    duration--;
                    run[j] = 1;
                }
            }
        }
        return res;
    }
}
