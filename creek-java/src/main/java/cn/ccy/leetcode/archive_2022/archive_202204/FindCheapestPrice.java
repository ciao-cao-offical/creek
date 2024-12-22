package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/24 0024
 * @description https://leetcode-cn.com/problems/cheapest-flights-within-k-stops/
 * ☆☆☆☆☆ cv 试试【动态规划】【Bellman Ford】：二维数组实现和两个一维数字实现
 */
public class FindCheapestPrice {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        System.out.println(new FindCheapestPrice().findCheapestPrice(n, edges, src, dst, k));
    }

    //动态规划
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 10000 * 101 + 1;
        int[][] f = new int[k + 2][n];
        for (int i = 0; i < k + 2; ++i) {
            Arrays.fill(f[i], INF);
        }
        f[0][src] = 0;
        for (int t = 1; t <= k + 1; ++t) {
            for (int[] flight : flights) {
                int j = flight[0], i = flight[1], cost = flight[2];
                f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost);
            }
        }
        int ans = INF;
        for (int t = 1; t <= k + 1; ++t) {
            ans = Math.min(ans, f[t][dst]);
        }
        return ans == INF ? -1 : ans;
    }
}
