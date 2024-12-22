package cn.ccy.leetcode.archive_2024.archive_202402;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/26 0026 22:01:10
 * @description https://leetcode.cn/problems/range-sum-of-bst/?envType=daily-question&envId=2024-02-26
 */
public class RangeSumBST {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
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
