package cn.ccy.leetcode._2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/6 0006
 * @description https://leetcode.cn/problems/add-one-row-to-tree/submissions/
 * ☆☆☆ 我摆烂了...sad...
 */
public class AddOneRow {
    public static void main(String[] args) {

    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) {
            return null;
        }
        if (depth == 1) {
            return new TreeNode(val, root, null);
        }
        if (depth == 2) {
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
        } else {
            root.left = addOneRow(root.left, val, depth - 1);
            root.right = addOneRow(root.right, val, depth - 1);
        }
        return root;
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
