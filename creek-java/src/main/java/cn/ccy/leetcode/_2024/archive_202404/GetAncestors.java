package cn.ccy.leetcode._2024.archive_202404;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/4 0004 20:35:04
 * @description https://leetcode.cn/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/?envType=daily-question&envId=2024-04-04
 * ☆☆☆ 2024cvd
 */
public class GetAncestors {
    public static void main(String[] args) {

    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Set<Integer>[] anc = new Set[n];   // 存储每个节点祖先的辅助数组
        for (int i = 0; i < n; ++i) {
            anc[i] = new HashSet<Integer>();
        }
        List<Integer>[] e = new List[n];   // 邻接表
        for (int i = 0; i < n; ++i) {
            e[i] = new ArrayList<Integer>();
        }
        int[] indeg = new int[n];   // 入度表
        // 预处理
        for (int[] edge : edges) {
            e[edge[0]].add(edge[1]);
            ++indeg[edge[1]];
        }
        // 广度优先搜索求解拓扑排序
        Queue<Integer> q = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : e[u]) {
                // 更新子节点的祖先哈希表
                anc[v].add(u);
                for (int i : anc[u]) {
                    anc[v].add(i);
                }
                --indeg[v];
                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }
        // 转化为答案数组
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; ++i) {
            res.add(new ArrayList<Integer>());
            for (int j : anc[i]) {
                res.get(i).add(j);
            }
            Collections.sort(res.get(i));
        }
        return res;
    }
}
