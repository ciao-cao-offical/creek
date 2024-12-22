package cn.ccy.leetcode.archive_2024.archive_202411;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/14 00:27:41
 * @description https://leetcode.cn/problems/count-the-number-of-good-nodes/?envType=daily-question&envId=2024-11-14
 */
public class CountGoodNodes {
    public static void main(String[] args) {

    }

    int res = 0;
    List<Integer>[] g;

    public int countGoodNodes(int[][] edges) {
        int n = edges.length + 1;
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int[] edge : edges) {
            g[edge[0]].add(edge[1]);
            g[edge[1]].add(edge[0]);
        }
        dfs(0, -1);
        return res;
    }

    public int dfs(int node, int parent) {
        boolean valid = true;
        int treeSize = 0;
        int subTreeSize = 0;
        for (int child : g[node]) {
            if (child != parent) {
                int size = dfs(child, node);
                if (subTreeSize == 0) {
                    subTreeSize = size;
                } else if (size != subTreeSize) {
                    valid = false;
                }
                treeSize += size;
            }
        }
        if (valid) {
            res++;
        }
        return treeSize + 1;
    }
}
