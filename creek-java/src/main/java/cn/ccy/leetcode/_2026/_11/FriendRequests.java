package cn.ccy.leetcode._2026._11;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/process-restricted-friend-requests/?envType=daily-question&envId=2026-11-29">2076. 处理含限制条件的好友请求</a>
 * @since 2026/11/29 01:09
 * ★★★★★ 2026cvd
 */
public class FriendRequests {
    public static void main(String[] args) {

    }

    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        UnionFind uf = new UnionFind(n);
        boolean[] ans = new boolean[requests.length];

        for (int i = 0; i < requests.length; i++) {
            int[] req = requests[i];
            int x = uf.findset(req[0]), y = uf.findset(req[1]);
            if (x != y) {
                boolean check = true;
                for (int[] res : restrictions) {
                    int u = uf.findset(res[0]), v = uf.findset(res[1]);
                    if ((x == u && y == v) || (x == v && y == u)) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    ans[i] = true;
                    uf.unite(x, y);
                } else {
                    ans[i] = false;
                }
            } else {
                ans[i] = true;
            }
        }
        return ans;
    }

    // 并查集模板
    class UnionFind {
        int[] parent;
        int[] size;
        int n;
        int setCount;

        public UnionFind(int _n) {
            n = _n;
            setCount = _n;
            parent = new int[n];
            size = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findset(int x) {
            if (parent[x] != x) {
                parent[x] = findset(parent[x]);
            }
            return parent[x];
        }

        public boolean unite(int x, int y) {
            x = findset(x);
            y = findset(y);
            if (x == y) {
                return false;
            }
            if (size[x] < size[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parent[y] = x;
            size[x] += size[y];
            setCount--;
            return true;
        }

        public boolean connected(int x, int y) {
            x = findset(x);
            y = findset(y);
            return x == y;
        }
    }
}
