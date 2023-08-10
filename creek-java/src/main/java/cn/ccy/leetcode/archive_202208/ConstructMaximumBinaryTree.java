package cn.ccy.leetcode.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/20 0020
 * @description https://leetcode.cn/problems/maximum-binary-tree/
 * 试试【单调栈】
 */
public class ConstructMaximumBinaryTree {
    public static void main(String[] args) {

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = dfs(nums, start, maxIndex - 1);
        root.right = dfs(nums, maxIndex + 1, end);
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
