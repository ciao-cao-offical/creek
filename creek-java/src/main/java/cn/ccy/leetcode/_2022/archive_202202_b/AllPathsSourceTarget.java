package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/14
 * @description https://leetcode-cn.com/problems/all-paths-from-source-to-target/
 */
public class AllPathsSourceTarget {

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        System.out.println(new AllPathsSourceTarget().allPathsSourceTarget(graph));
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<Integer>() {{
            add(0);
        }};
        dfs(ans, cur, graph, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> cur, int[][] graph, int x) {
        if (x == graph.length - 1) {
            ans.add(new ArrayList<>(cur));
        }
        if (graph[x].length == 0) {
            return;
        }
        for (int i : graph[x]) {
            cur.add(i);
            dfs(ans, cur, graph, i);
            cur.remove(cur.size() - 1);
        }
    }
}
