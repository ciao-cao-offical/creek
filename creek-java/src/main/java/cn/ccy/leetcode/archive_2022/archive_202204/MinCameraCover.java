package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/21
 * @description https://leetcode-cn.com/problems/binary-tree-cameras/
 * ☆☆☆☆☆
 */
public class MinCameraCover {
    public static void main(String[] args) {

    }

    //动态规划
    public int minCameraCover(TreeNode root) {
        int[] ans = dfs(root);
        return ans[1];
    }

    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE / 2, 0, 0};
        }

        int[] leftArray = dfs(root.left);
        int[] rightArray = dfs(root.right);
        int[] rootArray = new int[3];
        rootArray[0] = leftArray[2] + rightArray[2] + 1;
        rootArray[1] = Math.min(rootArray[0], Math.min(leftArray[0] + rightArray[1], rightArray[0] + leftArray[1]));
        rootArray[2] = Math.min(rootArray[0], leftArray[1] + rightArray[1]);

        return rootArray;
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
