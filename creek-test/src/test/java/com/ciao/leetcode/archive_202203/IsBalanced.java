package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/4
 * @description https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class IsBalanced {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftH = height(root.left);
        int rightH = height(root.right);
        if (leftH == -1 || rightH == -1 || Math.abs(leftH - rightH) > 1) {
            return -1;

        } else {
            return Math.max(leftH, rightH) + 1;
        }

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
