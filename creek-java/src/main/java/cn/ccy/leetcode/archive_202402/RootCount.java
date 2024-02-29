package cn.ccy.leetcode.archive_202402;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/29 0029 22:54:48
 * @description https://leetcode.cn/problems/count-number-of-possible-root-nodes/?envType=daily-question&envId=2024-02-29
 * ☆☆☆☆☆ 2024cvd
 */
public class RootCount {
    public static void main(String[] args) {

    }

    int cnt = 0, res = 0;
    int k;
    List<Integer>[] g;
    Set<Long> set;

    public int rootCount(int[][] edges, int[][] guesses, int k) {
        this.k = k;
        int n = edges.length + 1;
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        set = new HashSet<Long>();
        for (int[] v : edges) {
            g[v[0]].add(v[1]);
            g[v[1]].add(v[0]);
        }
        for (int[] v : guesses) {
            set.add(h(v[0], v[1]));
        }

        dfs(0, -1);
        redfs(0, -1, cnt);
        return res;
    }

    public long h(int x, int y) {
        return (long) x << 20 | y;
    }

    public void dfs(int x, int fat) {
        for (int y : g[x]) {
            if (y == fat) {
                continue;
            }
            cnt += set.contains(h(x, y)) ? 1 : 0;
            dfs(y, x);
        }
    }

    public void redfs(int x, int fat, int cnt) {
        if (cnt >= k) {
            res++;
        }
        for (int y : g[x]) {
            if (y == fat) {
                continue;
            }
            redfs(y, x, cnt - (set.contains(h(x, y)) ? 1 : 0) + (set.contains(h(y, x)) ? 1 : 0));
        }
    }
}
