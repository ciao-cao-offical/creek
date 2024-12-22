package cn.ccy.leetcode.archive_2023.archive_202309;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/21 0021 01:19:11
 * @description https://leetcode.cn/problems/collect-coins-in-a-tree/?envType=daily-question&envId=2023-09-21
 * ☆☆☆☆☆ cvd，加班到现在，困毙...o(╥﹏╥)o
 */
public class CollectTheCoins {
    public static void main(String[] args) {

    }

    public int collectTheCoins(int[] coins, int[][] edges) {
        int n = coins.length;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; ++i) {
            g[i] = new ArrayList<Integer>();
        }
        int[] degree = new int[n];
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1];
            g[x].add(y);
            g[y].add(x);
            ++degree[x];
            ++degree[y];
        }

        int rest = n;
        /* 删除树中所有无金币的叶子节点，直到树中所有的叶子节点都是含有金币的 */
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i) {
            if (degree[i] == 1 && coins[i] == 0) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            int u = queue.poll();
            --degree[u];
            --rest;
            for (int v : g[u]) {
                --degree[v];
                if (degree[v] == 1 && coins[v] == 0) {
                    queue.offer(v);
                }
            }
        }
        /* 删除树中所有的叶子节点, 连续删除2次 */
        for (int x = 0; x < 2; ++x) {
            queue = new ArrayDeque<Integer>();
            for (int i = 0; i < n; ++i) {
                if (degree[i] == 1) {
                    queue.offer(i);
                }
            }
            while (!queue.isEmpty()) {
                int u = queue.poll();
                --degree[u];
                --rest;
                for (int v : g[u]) {
                    --degree[v];
                }
            }
        }

        return rest == 0 ? 0 : (rest - 1) * 2;
    }
}
