package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-score-of-a-path-between-two-cities/?envType=daily-question&envId=2026-07-04">2492. 两个城市间路径的最小分数</a>
 * @since 2026/7/4 01:16
 */
public class MinScore {
    public static void main(String[] args) {

    }

    static class DSU {
        int[] parent;
        int[] rank;

        public DSU(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
            rank = new int[size];
        }

        public void join(int x, int y) {
            int rx = find(x);
            int ry = find(y);

            if (rx == ry) {
                return;
            }

            if (rank[rx] == rank[ry]) {
                rank[rx]++;
            } else if (rank[rx] < rank[ry]) {
                int temp = rx;
                rx = ry;
                ry = temp;
            }
            parent[ry] = rx;
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
    }

    public int minScore(int n, int[][] roads) {
        int ans = Integer.MAX_VALUE;

        DSU dsu = new DSU(n + 1);
        for (int[] road : roads) {
            dsu.join(road[0], road[1]);
        }

        int component = dsu.find(1);
        for (int[] road : roads) {
            if (dsu.find(road[0]) == component) {
                ans = Math.min(ans, road[2]);
            }
        }

        return ans;
    }
}
