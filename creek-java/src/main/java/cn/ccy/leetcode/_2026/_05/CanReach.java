package cn.ccy.leetcode._2026._05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/jump-game-iii/?envType=daily-question&envId=2026-05-17">1306. 跳跃游戏 III</a>
 * @since 2026/5/17 17:27
 */
public class CanReach {
    public static void main(String[] args) {

    }

    public boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }

        int n = arr.length;
        boolean[] used = new boolean[n];
        used[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : new int[]{u + arr[u], u - arr[u]}) {
                if (0 <= v && v < n && !used[v]) {
                    if (arr[v] == 0) {
                        return true;
                    }
                    q.offer(v);
                    used[v] = true;
                }
            }
        }

        return false;
    }
}
