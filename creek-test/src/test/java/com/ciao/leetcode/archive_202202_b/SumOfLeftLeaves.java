package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/27
 * @description https://leetcode-cn.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        TreeNode left = root.left;
        if (left != null) {
            if (left.left == null && left.right == null) {
                sum += left.val;

            } else {
                sum += sumOfLeftLeaves(left);
            }
        }

        TreeNode right = root.right;
        if (right != null) {
            sum += sumOfLeftLeaves(right);
        }

        return sum;
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
