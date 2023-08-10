package cn.ccy.leetcode.archive_202303;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/12 0012 20:41:10
 * @description https://leetcode.cn/problems/count-subtrees-with-max-distance-between-cities/
 * ☆☆☆☆☆ cvd from https://leetcode.cn/problems/count-subtrees-with-max-distance-between-cities/solutions/2162612/tu-jie-on3-mei-ju-zhi-jing-duan-dian-che-am2n/
 */
public class CountSubgraphsForEachDiameter {
    public static void main(String[] args) {

    }

    private List<Integer>[] g;
    private boolean[] inSet, vis;
    private int[] ans;
    private int n, diameter;

    public int[] countSubgraphsForEachDiameter(int n, int[][] edges) {
        this.n = n;
        g = new ArrayList[n];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (int[] e : edges) {
            int x = e[0] - 1, y = e[1] - 1; // 编号改为从 0 开始
            g[x].add(y);
            g[y].add(x); // 建树
        }

        ans = new int[n - 1];
        inSet = new boolean[n];
        f(0);
        return ans;
    }

    private void f(int i) {
        if (i == n) {
            for (int v = 0; v < n; ++v)
                if (inSet[v]) {
                    vis = new boolean[n];
                    diameter = 0;
                    dfs(v);
                    break;
                }
            if (diameter > 0 && Arrays.equals(vis, inSet))
                ++ans[diameter - 1];
            return;
        }

        // 不选城市 i
        f(i + 1);

        // 选城市 i
        inSet[i] = true;
        f(i + 1);
        inSet[i] = false; // 恢复现场
    }

    // 求树的直径
    private int dfs(int x) {
        vis[x] = true;
        int maxLen = 0;
        for (int y : g[x])
            if (!vis[y] && inSet[y]) {
                int ml = dfs(y) + 1;
                diameter = Math.max(diameter, maxLen + ml);
                maxLen = Math.max(maxLen, ml);
            }
        return maxLen;
    }
}
