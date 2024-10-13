package cn.ccy.leetcode.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/13 23:05:32
 * @description https://leetcode.cn/problems/egg-drop-with-2-eggs-and-n-floors/?envType=daily-question&envId=2024-10-13
 */
public class TwoEggDrop {
    public static void main(String[] args) {

    }

    public int twoEggDrop(int n) {
        int[] f = new int[n + 1];
        Arrays.fill(f, Integer.MAX_VALUE / 2);
        f[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                f[i] = Math.min(f[i], Math.max(k - 1, f[i - k]) + 1);
            }
        }
        return f[n];
    }
}
