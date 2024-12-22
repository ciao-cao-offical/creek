package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/17 0017
 * @description https://leetcode.cn/problems/deepest-leaves-sum/
 */
public class DeepestLeavesSum {
    public static void main(String[] args) {

    }

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        int result = 0;
        while (!dq.isEmpty()) {
            int size = dq.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = dq.poll();
                sum += node.val;
                if (node.left != null) {
                    dq.offer(node.left);
                }
                if (node.right != null) {
                    dq.offer(node.right);
                }
            }
            result = sum;
        }

        return result;
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
