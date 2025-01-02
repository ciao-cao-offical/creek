package cn.ccy.leetcode._2024.archive_202402;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/10 21:51
 * @description https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/?envType=daily-question&envId=2024-02-09
 */
public class Solution {
    public static void main(String[] args) {

    }

    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
