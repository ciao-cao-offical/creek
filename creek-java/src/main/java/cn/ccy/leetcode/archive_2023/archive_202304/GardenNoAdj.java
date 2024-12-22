package cn.ccy.leetcode.archive_2023.archive_202304;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/15 0015 17:22:46
 * @description https://leetcode.cn/problems/flower-planting-with-no-adjacent/description/
 */
public class GardenNoAdj {
    public static void main(String[] args) {

    }

    // 染色问题
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] path : paths) {
            adj[path[0] - 1].add(path[1] - 1);
            adj[path[1] - 1].add(path[0] - 1);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            List<Integer> neighs = adj[i];
            boolean[] colors = new boolean[5];
            for (Integer neigh : neighs) {
                colors[ans[neigh]] = true;
            }

            for (int j = 1; j <= 4; j++) {
                if (!colors[j]) {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }
}
