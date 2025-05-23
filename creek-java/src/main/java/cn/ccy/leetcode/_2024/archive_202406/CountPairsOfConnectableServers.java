package cn.ccy.leetcode._2024.archive_202406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/4 22:50:55
 * @description https://leetcode.cn/problems/count-pairs-of-connectable-servers-in-a-weighted-tree-network/?envType=daily-question&envId=2024-06-04
 * ☆☆☆ 2024cvd
 */
public class CountPairsOfConnectableServers {
    public static void main(String[] args) {

    }

    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        int n = edges.length + 1;
        List<int[]>[] graph = new ArrayList[n];
        Arrays.setAll(graph, i -> new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int pre = 0;
            for (int[] e : graph[i]) {
                int cnt = dfs(e[0], i, e[1] % signalSpeed, signalSpeed, graph);
                res[i] += pre * cnt;
                pre += cnt;
            }
        }
        return res;
    }

    private int dfs(int p, int root, int curr, int signalSpeed, List<int[]>[] graph) {
        int res = 0;
        if (curr == 0) {
            res++;
        }
        for (int[] e : graph[p]) {
            int v = e[0];
            int cost = e[1];
            if (v != root) {
                res += dfs(v, p, (curr + cost) % signalSpeed, signalSpeed, graph);
            }
        }
        return res;
    }
}
