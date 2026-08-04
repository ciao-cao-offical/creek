package cn.ccy.leetcode._2026._08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/remove-methods-from-project/?envType=daily-question&envId=2026-08-05">3310. 移除可疑的方法</a>
 * @since 2026/8/5 00:27
 */
public class RemainingMethods {
    public static void main(String[] args) {

    }

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] edges = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        int[] inDegree = new int[n];

        for (int[] inv : invocations) {
            edges[inv[0]].add(inv[1]);
            inDegree[inv[1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(k);
        boolean[] suspicious = new boolean[n];
        suspicious[k] = true;


        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : edges[u]) {
                inDegree[v]--;

                if (!suspicious[v]) {
                    queue.offer(v);
                    suspicious[v] = true;
                }
            }
        }

        boolean canRemoveAll = true;
        List<Integer> remaining = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (suspicious[i] && inDegree[i] > 0) {
                canRemoveAll = false;
                break;
            } else if (!suspicious[i]) {
                remaining.add(i);
            }
        }

        if (!canRemoveAll) {
            List<Integer> allNodes = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                allNodes.add(i);
            }
            return allNodes;
        }

        return remaining;
    }
}
