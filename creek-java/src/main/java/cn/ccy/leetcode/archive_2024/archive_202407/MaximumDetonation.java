package cn.ccy.leetcode.archive_2024.archive_202407;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/22 22:01:02
 * @description https://leetcode.cn/problems/detonate-the-maximum-bombs/?envType=daily-question&envId=2024-07-22
 */
public class MaximumDetonation {
    public static void main(String[] args) {

    }

    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        // 维护引爆关系有向图
        Map<Integer, List<Integer>> edges = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i != j && isConnected(bombs, i, j)) {
                    edges.putIfAbsent(i, new ArrayList<Integer>());
                    edges.get(i).add(j);
                }
            }
        }
        int res = 0;   // 最多引爆数量
        for (int i = 0; i < n; ++i) {
            // 遍历每个炸弹，广度优先搜索计算该炸弹可引爆的数量，并维护最大值
            boolean[] visited = new boolean[n];
            int cnt = 1;
            Queue<Integer> queue = new ArrayDeque<Integer>();
            queue.offer(i);
            visited[i] = true;
            while (!queue.isEmpty()) {
                int cidx = queue.poll();
                for (int nidx : edges.getOrDefault(cidx, new ArrayList<Integer>())) {
                    if (visited[nidx]) {
                        continue;
                    }
                    ++cnt;
                    queue.offer(nidx);
                    visited[nidx] = true;
                }
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    // 判断炸弹 u 能否引爆炸弹 v
    public boolean isConnected(int[][] bombs, int u, int v) {
        long dx = bombs[u][0] - bombs[v][0];
        long dy = bombs[u][1] - bombs[v][1];
        return (long) bombs[u][2] * bombs[u][2] >= dx * dx + dy * dy;
    }
}
