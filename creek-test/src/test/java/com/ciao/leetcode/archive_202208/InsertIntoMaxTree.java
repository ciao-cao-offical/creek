package com.ciao.leetcode.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/30 0030
 * @description https://leetcode.cn/problems/maximum-binary-tree-ii/
 */
public class InsertIntoMaxTree {
    public static void main(String[] args) {

    }

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        TreeNode prev = null, cur = root;
        while (cur != null && cur.val > val) {
            prev = cur;
            cur = cur.right;
        }

        if (prev == null) {
            node.left = cur;
            return node;

        } else {
            prev.right = node;
            node.left = cur;
            return root;
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
