package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-nodes-equal-to-average-of-subtree/?envType=daily-question&envId=2026-09-10">2265. 统计值等于子树平均值的节点数</a>
 * @since 2026/9/10 01:19
 */
public class AverageOfSubtree {
    public static void main(String[] args) {

    }

    private int ans;

    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] left = dfs(node.left);
        int leftSum = left[0];
        int leftSize = left[1];
        int[] right = dfs(node.right);
        int rightSum = right[0];
        int rightSize = right[1];
        int Size = leftSize + rightSize + 1;
        int Sum = leftSum + rightSum + node.val;
        if (Size > 0 && Sum / Size == node.val) {
            ans++;
        }
        return new int[]{Sum, Size};
    }

    public static class TreeNode {
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
