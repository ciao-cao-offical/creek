package cn.ccy.leetcode.archive_2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 0014 01:13:24
 * @description https://leetcode.cn/problems/merge-two-binary-trees/
 */
public class MergeTrees {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }

        TreeNode head = new TreeNode(root1.val + root2.val);
        head.left = mergeTrees(root1.left, root2.left);
        head.right = mergeTrees(root1.right, root2.right);

        return head;
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
