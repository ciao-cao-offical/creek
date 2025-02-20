package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/16
 * @description https://leetcode-cn.com/problems/number-of-ways-to-reconstruct-a-tree/
 * ★★★★★ cv
 */
public class CheckWays {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}};
        System.out.println(new CheckWays().checkWays(pairs));
    }

    public int checkWays(int[][] pairs) {
        Map<Integer, Set<Integer>> adj = new HashMap<Integer, Set<Integer>>();
        for (int[] p : pairs) {
            adj.putIfAbsent(p[0], new HashSet<Integer>());
            adj.putIfAbsent(p[1], new HashSet<Integer>());
            adj.get(p[0]).add(p[1]);
            adj.get(p[1]).add(p[0]);
        }
        /* 检测是否存在根节点*/
        int root = -1;
        Set<Map.Entry<Integer, Set<Integer>>> entries = adj.entrySet();
        for (Map.Entry<Integer, Set<Integer>> entry : entries) {
            int node = entry.getKey();
            Set<Integer> neighbours = entry.getValue();
            if (neighbours.size() == adj.size() - 1) {
                root = node;
            }
        }
        if (root == -1) {
            return 0;
        }

        int res = 1;
        for (Map.Entry<Integer, Set<Integer>> entry : entries) {
            int node = entry.getKey();
            Set<Integer> neighbours = entry.getValue();
            if (node == root) {
                continue;
            }
            int currDegree = neighbours.size();
            int parent = -1;
            int parentDegree = Integer.MAX_VALUE;

            /* 根据 degree 的大小找到 node 的父节点 parent */
            for (int neighbour : neighbours) {
                if (adj.get(neighbour).size() < parentDegree && adj.get(neighbour).size() >= currDegree) {
                    parent = neighbour;
                    parentDegree = adj.get(neighbour).size();
                }
            }
            if (parent == -1) {
                return 0;
            }

            /* 检测 neighbours 是否是 adj[parent] 的子集 */
            for (int neighbour : neighbours) {
                if (neighbour == parent) {
                    continue;
                }
                if (!adj.get(parent).contains(neighbour)) {
                    return 0;
                }
            }
            if (parentDegree == currDegree) {
                res = 2;
            }
        }
        return res;
    }
}
