package cn.ccy.leetcode._2022.archive_202207;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/25 0025
 * @description https://leetcode.cn/problems/complete-binary-tree-inserter/
 */
public class CBTInserter {

    public static void main(String[] args) {

    }

    Queue<TreeNode> candidate;
    TreeNode root;

    public CBTInserter(TreeNode root) {
        this.candidate = new ArrayDeque<TreeNode>();
        this.root = root;

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (!(node.left != null && node.right != null)) {
                candidate.offer(node);
            }
        }
    }

    public int insert(int val) {
        TreeNode child = new TreeNode(val);
        TreeNode node = candidate.peek();
        int ret = node.val;
        if (node.left == null) {
            node.left = child;
        } else {
            node.right = child;
            candidate.poll();
        }
        candidate.offer(child);
        return ret;
    }

    public TreeNode get_root() {
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
