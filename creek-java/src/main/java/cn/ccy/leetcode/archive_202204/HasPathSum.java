package cn.ccy.leetcode.archive_202204;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/5 0005
 * @description https://leetcode-cn.com/problems/path-sum/
 * 试试【广度优先搜索】
 */
public class HasPathSum {
    public static void main(String[] args) {

    }

    //广度优先
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> qtn = new LinkedList<>();
        Queue<Integer> qsum = new LinkedList<>();
        qtn.offer(root);
        qsum.offer(root.val);
        while (!qtn.isEmpty()) {
            TreeNode poll = qtn.poll();
            Integer temp = qsum.poll();
            if (poll.left == null && poll.right == null) {
                if (temp == targetSum) {
                    return true;
                }
                continue;
            }

            if (poll.left != null) {
                qtn.offer(poll.left);
                qsum.offer(temp + poll.left.val);
            }

            if (poll.right != null) {
                qtn.offer(poll.right);
                qsum.offer(temp + poll.right.val);
            }
        }

        return false;
    }

    //递归
    /*public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        int left = targetSum - root.val;
        return hasPathSum(root.left, left) || hasPathSum(root.right, left);
    }*/

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
