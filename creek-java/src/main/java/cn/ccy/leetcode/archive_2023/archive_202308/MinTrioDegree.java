package cn.ccy.leetcode.archive_2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/31 0031 00:12:16
 * @description https://leetcode.cn/problems/minimum-degree-of-a-connected-trio-in-a-graph/
 */
public class MinTrioDegree {
    public static void main(String[] args) {

    }

    // 无向图遍历
    public int minTrioDegree(int n, int[][] edges) {
        int[][] g = new int[n][n];
        int[] degree = new int[n];

        for (int[] edge : edges) {
            int x = edge[0] - 1, y = edge[1] - 1;
            g[x][y] = g[y][x] = 1;
            ++degree[x];
            ++degree[y];
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (g[i][j] == 1) {
                    for (int k = j + 1; k < n; ++k) {
                        if (g[i][k] == 1 && g[j][k] == 1) {
                            ans = Math.min(ans, degree[i] + degree[j] + degree[k] - 6);
                        }
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
