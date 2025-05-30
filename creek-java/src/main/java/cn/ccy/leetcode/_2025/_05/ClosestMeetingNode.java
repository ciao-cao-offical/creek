package cn.ccy.leetcode._2025._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-closest-node-to-given-two-nodes/?envType=daily-question&envId=2025-05-30">2359. 找到离给定两个节点最近的节点</a>
 * @since 2025/5/30 22:48
 */
public class ClosestMeetingNode {
    public static void main(String[] args) {

    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] d1 = get(edges, node1);
        int[] d2 = get(edges, node2);

        int res = -1;
        for (int i = 0; i < n; i++) {
            if (d1[i] != -1 && d2[i] != -1) {
                if (res == -1 || Math.max(d1[res], d2[res]) > Math.max(d1[i], d2[i])) {
                    res = i;
                }
            }
        }
        return res;
    }

    private int[] get(int[] edges, int node) {
        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        int distance = 0;
        while (node != -1 && dist[node] == -1) {
            dist[node] = distance++;
            node = edges[node];
        }
        return dist;
    }
}
