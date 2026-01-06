package cn.ccy.leetcode._2026._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-product-of-splitted-binary-tree/?envType=daily-question&envId=2026-01-07">1339. 分裂二叉树的最大乘积</a>
 * @since 2026/1/7 01:43
 */
public class MaxProduct {
    public static void main(String[] args) {

    }

    private int sum = 0;
    private int best = 0;

    public int maxProduct(TreeNode root) {
        dfs(root);
        dfs2(root);
        return (int) ((long) best * (sum - best) % 1000000007);
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        sum += node.val;
        dfs(node.left);
        dfs(node.right);
    }

    private int dfs2(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int cur = dfs2(node.left) + dfs2(node.right) + node.val;
        if (Math.abs(cur * 2 - sum) < Math.abs(best * 2 - sum)) {
            best = cur;
        }
        return cur;
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
