package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/23
 * @description https://leetcode-cn.com/problems/merge-two-binary-trees/
 */
public class MergeTrees {
    public static void main(String[] args) {

    }

    //深度优先
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode treeNode = new TreeNode(root1.val + root2.val);
        treeNode.left = mergeTrees(root1.left, root2.left);
        treeNode.right = mergeTrees(root1.right, root2.right);

        return treeNode;
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
