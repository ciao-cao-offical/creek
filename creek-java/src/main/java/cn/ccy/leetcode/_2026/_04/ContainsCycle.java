package cn.ccy.leetcode._2026._04;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/detect-cycles-in-2d-grid/?envType=daily-question&envId=2026-04-26">1559. 二维网格图中探测环</a>
 * @since 2026/4/26 16:39
 */
public class ContainsCycle {
    public static void main(String[] args) {

    }

    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        UnionFind uf = new UnionFind(m * n);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i > 0 && grid[i][j] == grid[i - 1][j]) {
                    if (!uf.findAndUnite(i * n + j, (i - 1) * n + j)) {
                        return true;
                    }
                }
                if (j > 0 && grid[i][j] == grid[i][j - 1]) {
                    if (!uf.findAndUnite(i * n + j, i * n + j - 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static class UnionFind {
        int[] parent;
        int[] size;
        int n;
        int setCount;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; ++i) {
                parent[i] = i;
            }
            size = new int[n];
            Arrays.fill(size, 1);
            this.n = n;
            setCount = n;
        }

        public int findset(int x) {
            return parent[x] == x ? x : (parent[x] = findset(parent[x]));
        }

        public void unite(int x, int y) {
            if (size[x] < size[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parent[y] = x;
            size[x] += size[y];
            --setCount;
        }

        public boolean findAndUnite(int x, int y) {
            int parentX = findset(x);
            int parentY = findset(y);
            if (parentX != parentY) {
                unite(parentX, parentY);
                return true;
            }
            return false;
        }
    }
}
