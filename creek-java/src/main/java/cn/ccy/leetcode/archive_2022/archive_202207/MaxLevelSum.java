package cn.ccy.leetcode.archive_2022.archive_202207;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/31 0031
 * @description https://leetcode.cn/problems/maximum-level-sum-of-a-binary-tree/
 */
public class MaxLevelSum {
    public static void main(String[] args) {

    }

    //dfs
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int res = 1;
        int maxSum = root.val;
        Deque<TreeNode> dq = new ArrayDeque<>();
        if (root.left != null) {
            dq.add(root.left);
        }
        if (root.right != null) {
            dq.add(root.right);
        }
        if (dq.isEmpty()) {
            return res;
        }

        int currentLevel = 1;
        while (!dq.isEmpty()) {
            currentLevel++;
            int size = dq.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = dq.poll();
                if (node.left != null) {
                    dq.add(node.left);
                }
                if (node.right != null) {
                    dq.add(node.right);
                }
                sum += node.val;
            }

            if (sum > maxSum) {
                maxSum = sum;
                res = currentLevel;
            }
        }
        return res;
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
