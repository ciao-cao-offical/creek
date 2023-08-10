package cn.ccy.leetcode.archive_202210;

import java.util.ArrayList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/16 0016
 * @description https://leetcode.cn/problems/possible-bipartition/
 */
public class PossibleBipartition {
    public static void main(String[] args) {
        int n = 4;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};
        System.out.println(new PossibleBipartition().possibleBipartition(n, dislikes));
    }

    //深度遍历 + 染色法
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color = new int[n + 1];
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] p : dislikes) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }

        for (int i = 1; i <= n; i++) {
            if (color[i] == 0 && !dfs(i, 1, color, g)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int curNode, int nowColor, int[] color, ArrayList<Integer>[] g) {
        color[curNode] = nowColor;
        for (Integer nextNode : g[curNode]) {
            if (color[nextNode] != 0 && color[nextNode] == color[curNode]) {
                return false;
            }

            if (color[nextNode] == 0 && !dfs(nextNode, 3 ^ nowColor, color, g)) {
                return false;
            }
        }

        return true;
    }
}
