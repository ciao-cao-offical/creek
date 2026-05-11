package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-initial-energy-to-finish-tasks/?envType=daily-question&envId=2026-05-12">1665. 完成所有任务的最少初始能量</a>
 * @since 2026/5/12 00:22
 */
public class MinimumEffort {
    public static void main(String[] args) {

    }

    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> a[1] - a[0] - (b[1] - b[0]));
        int ans = 0;
        for (int[] task : tasks) {
            ans = Math.max(ans + task[0], task[1]);
        }
        return ans;
    }
}
