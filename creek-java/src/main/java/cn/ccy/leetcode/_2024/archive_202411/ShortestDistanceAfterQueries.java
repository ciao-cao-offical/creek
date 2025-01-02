package cn.ccy.leetcode._2024.archive_202411;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/19 00:55:27
 * @description https://leetcode.cn/problems/shortest-distance-after-road-addition-queries-i/?envType=daily-question&envId=2024-11-19
 */
public class ShortestDistanceAfterQueries {
    public static void main(String[] args) {

    }

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> neighbors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            neighbors.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            neighbors.get(i).add(i + 1);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            neighbors.get(queries[i][0]).add(queries[i][1]);
            res[i] = bfs(n, neighbors);
        }
        return res;
    }

    private int bfs(int n, List<List<Integer>> neighbors) {
        int[] dist = new int[n];
        for (int i = 1; i < n; i++) {
            dist[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int y : neighbors.get(x)) {
                if (dist[y] >= 0) {
                    continue;
                }
                q.add(y);
                dist[y] = dist[x] + 1;
            }
        }
        return dist[n - 1];
    }
}
