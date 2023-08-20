package cn.ccy.leetcode.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/20 0020 20:33:29
 * @description https://leetcode.cn/problems/root-equals-sum-of-children/description/
 */
public class CheckTree {
    public static void main(String[] args) {

    }

    public boolean checkTree(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return false;
        }

        return root.val == root.left.val + root.right.val;
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
