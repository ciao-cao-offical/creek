package cn.ccy.leetcode.archive_2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/6
 * @description https://leetcode.cn/problems/evaluate-boolean-binary-tree/
 */
public class EvaluateTree {
    public static void main(String[] args) {

    }

    //加班呢，到家做不完了😭，cvd
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }

    class TreeNode {
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
