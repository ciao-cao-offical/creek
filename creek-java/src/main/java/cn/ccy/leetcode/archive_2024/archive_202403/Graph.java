package cn.ccy.leetcode.archive_2024.archive_202403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/26 0026 00:18:05
 * @description https://leetcode.cn/problems/design-graph-with-shortest-path-calculator/?envType=daily-question&envId=2024-03-26
 * ☆☆☆☆☆ 2024cvd
 */
public class Graph {
    public static void main(String[] args) {

    }

    private List<int[]>[] graph;

    public Graph(int n, int[][] edges) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<int[]>();
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int cost = edge[2];
            graph[x].add(new int[]{y, cost});
        }
    }

    public void addEdge(int[] edge) {
        int x = edge[0];
        int y = edge[1];
        int cost = edge[2];
        graph[x].add(new int[]{y, cost});
    }

    public int shortestPath(int node1, int node2) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[node1] = 0;
        pq.offer(new int[]{0, node1});
        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            int cost = arr[0], cur = arr[1];
            if (cur == node2) {
                return cost;
            }
            for (int[] nextArr : graph[cur]) {
                int next = nextArr[0], ncost = nextArr[1];
                if (dist[next] > cost + ncost) {
                    dist[next] = cost + ncost;
                    pq.offer(new int[]{cost + ncost, next});
                }
            }
        }
        return -1;
    }
}
