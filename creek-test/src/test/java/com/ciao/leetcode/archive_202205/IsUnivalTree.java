package com.ciao.leetcode.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/24 0024
 * @description https://leetcode.cn/problems/univalued-binary-tree/
 */
public class IsUnivalTree {
    public static void main(String[] args) {

    }

    //深度优先遍历
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left != null) {
            if (root.val != root.left.val || !isUnivalTree(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val || !isUnivalTree(root.right)) {
                return false;
            }
        }

        return true;
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
