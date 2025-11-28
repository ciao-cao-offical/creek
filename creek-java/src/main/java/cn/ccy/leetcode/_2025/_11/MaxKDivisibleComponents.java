package cn.ccy.leetcode._2025._11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-k-divisible-components/?envType=daily-question&envId=2025-11-28">2872. 可以被 K 整除连通块的最大数目</a>
 * @since 2025/11/28 23:02
 * ★★★★★ 2025cvd
 */
public class MaxKDivisibleComponents {
    public static void main(String[] args) {

    }

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        this.graph = graph;
        this.values = values;
        this.divisor = k;
        this.answer = 0;
        dfs(0, -1);
        return answer;
    }

    private List<Integer>[] graph;
    private int[] values;
    private int divisor;
    private int answer;

    private long dfs(int node, int parent) {
        long sum = values[node];
        for (int neighbor : graph[node]) {
            if (neighbor != parent) {
                sum += dfs(neighbor, node);
            }
        }
        if (sum % divisor == 0) {
            answer++;
        }
        return sum;
    }
}
