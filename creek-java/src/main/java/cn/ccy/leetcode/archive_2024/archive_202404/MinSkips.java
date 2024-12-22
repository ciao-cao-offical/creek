package cn.ccy.leetcode.archive_2024.archive_202404;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/19 22:09:57
 * @description https://leetcode.cn/problems/minimum-skips-to-arrive-at-meeting-on-time/?envType=daily-question&envId=2024-04-19
 * ☆☆☆☆☆ 2024cvd
 */
public class MinSkips {
    public static void main(String[] args) {

    }

    // 可忽略误差
    static final double EPS = 1e-7;
    // 极大值
    static final double INFTY = 1e20;

    public int minSkips(int[] dist, int speed, int hoursBefore) {
        int n = dist.length;
        double[][] f = new double[n + 1][n + 1];
        for (int i = 0; i <= n; ++i) {
            Arrays.fill(f[i], INFTY);
        }
        f[0][0] = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (j != i) {
                    f[i][j] = Math.min(f[i][j], Math.ceil(f[i - 1][j] + (double) dist[i - 1] / speed - EPS));
                }
                if (j != 0) {
                    f[i][j] = Math.min(f[i][j], f[i - 1][j - 1] + (double) dist[i - 1] / speed);
                }
            }
        }
        for (int j = 0; j <= n; ++j) {
            if (f[n][j] < hoursBefore + EPS) {
                return j;
            }
        }
        return -1;
    }
}
