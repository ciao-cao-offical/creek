package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayDeque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/27
 * @description https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepth {
    public static void main(String[] args) {

    }

    //广度优先
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }

        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size > 0) {
                TreeNode poll = deque.poll();
                if (poll.left != null) {
                    deque.offer(poll.left);
                }
                if (poll.right != null) {
                    deque.offer(poll.right);
                }
                size--;
            }

            depth++;
        }

        return depth;
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
