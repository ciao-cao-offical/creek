package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/jump-game-v/?envType=daily-question&envId=2026-05-24">1340. 跳跃游戏 V</a>
 * @since 2026/5/24 18:59
 */
public class MaxJumps {
    public static void main(String[] args) {

    }

    private int[] f;

    private void dfs(int[] arr, int id, int d, int n) {
        if (f[id] != -1) {
            return;
        }
        f[id] = 1;
        for (int i = id - 1; i >= 0 && id - i <= d && arr[id] > arr[i]; --i) {
            dfs(arr, i, d, n);
            f[id] = Math.max(f[id], f[i] + 1);
        }
        for (int i = id + 1; i < n && i - id <= d && arr[id] > arr[i]; ++i) {
            dfs(arr, i, d, n);
            f[id] = Math.max(f[id], f[i] + 1);
        }
    }

    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        f = new int[n];
        Arrays.fill(f, -1);
        for (int i = 0; i < n; ++i) {
            dfs(arr, i, d, n);
        }
        int ans = 0;
        for (int val : f) {
            ans = Math.max(ans, val);
        }
        return ans;
    }
}
