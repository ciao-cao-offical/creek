package cn.ccy.leetcode.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/18 0018 22:48:07
 * @description https://leetcode.cn/problems/maximum-difference-between-node-and-ancestor/
 */
public class MaxAncestorDiff {
    public static void main(String[] args) {

    }

    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int min, int max) {
        if (node == null) {
            return 0;
        }

        int diff = Math.max(Math.abs(node.val - min), Math.abs(node.val - max));
        min = Math.min(node.val, min);
        max = Math.max(node.val, max);
        diff = Math.max(diff, dfs(node.left, min, max));
        diff = Math.max(diff, dfs(node.right, min, max));
        return diff;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
