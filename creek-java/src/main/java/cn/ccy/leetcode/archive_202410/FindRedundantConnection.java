package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/27 22:27:51
 * @description https://leetcode.cn/problems/redundant-connection/?envType=daily-question&envId=2024-10-27
 */
public class FindRedundantConnection {
    public static void main(String[] args) {

    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
            } else {
                return edge;
            }
        }
        return new int[0];
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }
}
