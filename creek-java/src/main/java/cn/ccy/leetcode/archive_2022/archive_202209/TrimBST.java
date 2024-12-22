package cn.ccy.leetcode.archive_2022.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/10
 * @description https://leetcode.cn/problems/trim-a-binary-search-tree/
 * 试试【迭代】
 */
public class TrimBST {
    public static void main(String[] args) {

    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

        if (root.val < low) {
            return trimBST(root.right, low, high);

        } else if (root.val > high) {
            return trimBST(root.left, low, high);

        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
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
