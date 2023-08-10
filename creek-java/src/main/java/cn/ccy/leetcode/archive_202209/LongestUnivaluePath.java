package cn.ccy.leetcode.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/2 0002
 * @description https://leetcode.cn/problems/longest-univalue-path/
 * 我承认，我摆烂了，但是TI11的新本子，和克苏鲁的虚空它不香吗？
 */
public class LongestUnivaluePath {
    public static void main(String[] args) {

    }

    int res;

    public int longestUnivaluePath(TreeNode root) {
        res = 0;
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left), right = dfs(root.right);
        int left1 = 0, right1 = 0;
        if (root.left != null && root.left.val == root.val) {
            left1 = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            right1 = right + 1;
        }
        res = Math.max(res, left1 + right1);
        return Math.max(left1, right1);
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
