package cn.ccy.leetcode.archive_202311;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/14 0014 01:28:31
 * @description https://leetcode.cn/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/?envType=daily-question&envId=2023-11-14
 * ☆☆☆ cvd sorry, it's dota time！
 */
public class FindTheCity {
    public static void main(String[] args) {

    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[] ans = {Integer.MAX_VALUE / 2, -1};
        int[][] mp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(mp[i], Integer.MAX_VALUE / 2);
        }
        for (int[] eg : edges) {
            int from = eg[0], to = eg[1], weight = eg[2];
            mp[from][to] = mp[to][from] = weight;
        }
        for (int k = 0; k < n; ++k) {
            mp[k][k] = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    mp[i][j] = Math.min(mp[i][j], mp[i][k] + mp[k][j]);
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (mp[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt <= ans[0]) {
                ans[0] = cnt;
                ans[1] = i;
            }
        }
        return ans[1];
    }
}
