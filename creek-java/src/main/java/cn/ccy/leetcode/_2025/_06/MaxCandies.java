package cn.ccy.leetcode._2025._06;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-candies-you-can-get-from-boxes/?envType=daily-question&envId=2025-06-03">1298. 你能从盒子里获得的最大糖果数</a>
 * @since 2025/6/3 22:50
 * ★★★★★ 2025cvd
 */
public class MaxCandies {
    public static void main(String[] args) {

    }

    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        boolean[] canOpen = new boolean[n];
        boolean[] hasBox = new boolean[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; ++i) {
            canOpen[i] = (status[i] == 1);
        }

        Queue<Integer> q = new LinkedList<>();
        int ans = 0;
        for (int box : initialBoxes) {
            hasBox[box] = true;
            if (canOpen[box]) {
                q.offer(box);
                used[box] = true;
                ans += candies[box];
            }
        }

        while (!q.isEmpty()) {
            int bigBox = q.poll();
            for (int key : keys[bigBox]) {
                canOpen[key] = true;
                if (!used[key] && hasBox[key]) {
                    q.offer(key);
                    used[key] = true;
                    ans += candies[key];
                }
            }
            for (int box : containedBoxes[bigBox]) {
                hasBox[box] = true;
                if (!used[box] && canOpen[box]) {
                    q.offer(box);
                    used[box] = true;
                    ans += candies[box];
                }
            }
        }

        return ans;
    }
}
