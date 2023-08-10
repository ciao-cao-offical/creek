package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/12
 * @description https://leetcode-cn.com/problems/subtree-of-another-tree/
 */
public class IsSubtree {
    public static void main(String[] args) {

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode f, TreeNode s) {
        if (f == null) {
            return false;
        }

        return check(f, s) || dfs(f.left, s) || dfs(f.right, s);
    }

    private boolean check(TreeNode f, TreeNode s) {
        if (f == null && s == null) {
            return true;
        }
        if (f == null || s == null || f.val != s.val) {
            return false;
        }

        return check(f.left, s.left) && check(f.right, s.right);
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
