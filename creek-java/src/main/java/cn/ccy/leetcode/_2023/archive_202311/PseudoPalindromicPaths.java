package cn.ccy.leetcode._2023.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/25 0025 19:34:00
 * @description https://leetcode.cn/problems/pseudo-palindromic-paths-in-a-binary-tree/?envType=daily-question&envId=Invalid%20Date
 */
public class PseudoPalindromicPaths {
    public static void main(String[] args) {

    }

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] counter = new int[10];
        return dfs(root, counter);
    }

    public int dfs(TreeNode root, int[] counter) {
        if (root == null) {
            return 0;
        }
        counter[root.val]++;
        int res = 0;
        if (root.left == null && root.right == null) {
            if (isPseudoPalindrome(counter)) {
                res = 1;
            }
        } else {
            res = dfs(root.left, counter) + dfs(root.right, counter);
        }
        counter[root.val]--;
        return res;
    }

    public boolean isPseudoPalindrome(int[] counter) {
        int odd = 0;
        for (int value : counter) {
            if (value % 2 == 1) {
                odd++;
            }
        }
        return odd <= 1;
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
