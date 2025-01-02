package cn.ccy.leetcode._2023.archive_202312;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/4 0004 00:03:27
 * @description https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/?envType=daily-question&envId=2023-12-04
 * ☆☆☆ 2023b2t
 */
public class BstToGst {
    public static void main(String[] args) {

    }

    // 反序中序遍历
    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
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
