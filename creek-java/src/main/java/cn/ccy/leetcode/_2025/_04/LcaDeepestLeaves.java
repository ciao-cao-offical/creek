package cn.ccy.leetcode._2025._04;

import javafx.util.Pair;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-deepest-leaves/?envType=daily-question&envId=2025-04-04">1123. 最深叶节点的最近公共祖先</a>
 * @since 2025/4/4 21:00
 */
public class LcaDeepestLeaves {
    public static void main(String[] args) {

    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return f(root).getKey();
    }

    private Pair<TreeNode, Integer> f(TreeNode root) {
        if (root == null) {
            return new Pair<>(root, 0);
        }

        Pair<TreeNode, Integer> left = f(root.left);
        Pair<TreeNode, Integer> right = f(root.right);

        if (left.getValue() > right.getValue()) {
            return new Pair<>(left.getKey(), left.getValue() + 1);
        }
        if (left.getValue() < right.getValue()) {
            return new Pair<>(right.getKey(), right.getValue() + 1);
        }
        return new Pair<>(root, left.getValue() + 1);
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
