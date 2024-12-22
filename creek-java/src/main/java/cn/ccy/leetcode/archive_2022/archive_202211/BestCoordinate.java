package cn.ccy.leetcode.archive_2022.archive_202211;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/2
 * @description https://leetcode.cn/problems/coordinate-with-maximum-network-quality/
 */
public class BestCoordinate {
    public static void main(String[] args) {
        int[][] towers = {{1, 2, 5}, {2, 1, 7}, {3, 1, 9}};
        int radius = 2;
        System.out.println(Arrays.toString(new BestCoordinate().bestCoordinate(towers, radius)));
    }

    //【模拟+暴力枚举】from【宫水三叶】：https://leetcode.cn/problems/coordinate-with-maximum-network-quality/solution/by-ac_oier-xtx3/
    public int[] bestCoordinate(int[][] towers, int k) {
        int[][] g = new int[110][110];
        int x = 0, y = 0, val = 0;
        for (int[] t : towers) {
            int a = t[0], b = t[1], q = t[2];
            for (int i = Math.max(0, a - k); i <= a + k; i++) {
                for (int j = Math.max(0, b - k); j <= b + k; j++) {
                    double d = Math.sqrt((a - i) * (a - i) + (b - j) * (b - j));
                    if (d > k) continue;
                    g[i][j] += Math.floor(q / (1 + d));
                    if (g[i][j] > val) {
                        x = i;
                        y = j;
                        val = g[i][j];
                    } else if (g[i][j] == val && (i < x || (i == x && j < y))) {
                        x = i;
                        y = j;
                    }
                }
            }
        }
        return new int[]{x, y};
    }
}
