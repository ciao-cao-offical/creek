package cn.ccy.leetcode._2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/20 01:02:37
 * @description https://leetcode.cn/problems/shortest-distance-after-road-addition-queries-ii/?envType=daily-question&envId=2024-11-20
 * ☆☆☆☆☆ 2024cvd
 */
public class ShortestDistanceAfterQueries2 {
    public static void main(String[] args) {

    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] roads = new int[n];
        for (int i = 0; i < n; i++) {
            roads[i] = i + 1;
        }
        int[] res = new int[queries.length];
        int dist = n - 1;
        for (int i = 0; i < queries.length; i++) {
            int k = roads[queries[i][0]];
            roads[queries[i][0]] = queries[i][1];
            while (k != -1 && k < queries[i][1]) {
                int t = roads[k];
                roads[k] = -1;
                k = t;
                dist--;
            }
            res[i] = dist;
        }
        return res;
    }
}
