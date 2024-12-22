package cn.ccy.leetcode.archive_2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/31 00:02:07
 * @description https://leetcode.cn/problems/maximum-sum-of-subsequence-with-non-adjacent-elements/?envType=daily-question&envId=2024-10-31
 * ☆☆☆☆☆ 2024cvd
 */
public class MaximumSumSubsequence {
    public static void main(String[] args) {

    }

    public static final int MOD = 1000000007;

    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        int n = nums.length;
        SegTree tree = new SegTree(n);
        tree.init(nums);

        long ans = 0;
        for (int[] q : queries) {
            tree.update(q[0], q[1]);
            ans = (ans + tree.query()) % MOD;
        }
        return (int) ans;
    }

    class SegNode {
        long v00, v01, v10, v11;

        SegNode() {
            v00 = v01 = v10 = v11 = 0;
        }

        void set(long v) {
            v00 = v01 = v10 = 0;
            v11 = Math.max(v, 0);
        }

        long best() {
            return v11;
        }
    }

    class SegTree {
        int n;
        SegNode[] tree;

        SegTree(int n) {
            this.n = n;
            tree = new SegNode[n * 4 + 1];
            for (int i = 0; i < tree.length; i++) {
                tree[i] = new SegNode();
            }
        }

        void init(int[] nums) {
            internalInit(nums, 1, 1, n);
        }

        void update(int x, int v) {
            internalUpdate(1, 1, n, x + 1, v);
        }

        long query() {
            return tree[1].best();
        }

        private void internalInit(int[] nums, int x, int l, int r) {
            if (l == r) {
                tree[x].set(nums[l - 1]);
                return;
            }
            int mid = (l + r) / 2;
            internalInit(nums, x * 2, l, mid);
            internalInit(nums, x * 2 + 1, mid + 1, r);
            pushup(x);
        }

        private void internalUpdate(int x, int l, int r, int pos, int v) {
            if (l > pos || r < pos) {
                return;
            }
            if (l == r) {
                tree[x].set(v);
                return;
            }
            int mid = (l + r) / 2;
            internalUpdate(x * 2, l, mid, pos, v);
            internalUpdate(x * 2 + 1, mid + 1, r, pos, v);
            pushup(x);
        }

        private void pushup(int x) {
            int l = x * 2, r = x * 2 + 1;
            tree[x].v00 = Math.max(tree[l].v00 + tree[r].v10, tree[l].v01 + tree[r].v00);
            tree[x].v01 = Math.max(tree[l].v00 + tree[r].v11, tree[l].v01 + tree[r].v01);
            tree[x].v10 = Math.max(tree[l].v10 + tree[r].v10, tree[l].v11 + tree[r].v00);
            tree[x].v11 = Math.max(tree[l].v10 + tree[r].v11, tree[l].v11 + tree[r].v01);
        }
    }
}
