package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/22 0022
 * @description https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
 */
public class MaxPathSum {
    private Integer maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {

    }

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftMax = Math.max(maxGain(node.left), 0);
        int rightMax = Math.max(maxGain(node.right), 0);
        int sum = node.val + leftMax + rightMax;
        maxSum = Math.max(sum, maxSum);
        return node.val + Math.max(leftMax, rightMax);
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
