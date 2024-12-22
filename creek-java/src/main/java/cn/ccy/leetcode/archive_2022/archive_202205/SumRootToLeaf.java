package cn.ccy.leetcode.archive_2022.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/30 0030
 * @description https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/
 * ☆☆ 试试【方法二：迭代】
 */
public class SumRootToLeaf {
    public static void main(String[] args) {

    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int value) {
        if (node == null) {
            return 0;
        }
        value = value << 1 | node.val;
        if (node.left == null && node.right == null) {
            return value;
        }

        return dfs(node.left, value) + dfs(node.right, value);
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
