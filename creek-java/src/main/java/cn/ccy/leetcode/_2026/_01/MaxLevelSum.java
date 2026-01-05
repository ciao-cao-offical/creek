package cn.ccy.leetcode._2026._01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-level-sum-of-a-binary-tree/?envType=daily-question&envId=2026-01-06">1161. 最大层内元素和</a>
 * @since 2026/1/6 00:13
 */
public class MaxLevelSum {
    public static void main(String[] args) {

    }

    private List<Integer> sum = new ArrayList<Integer>();

    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int ans = 0;
        for (int i = 0; i < sum.size(); ++i) {
            if (sum.get(i) > sum.get(ans)) {
                ans = i;
            }
        }
        return ans + 1; // 层号从 1 开始
    }

    private void dfs(TreeNode node, int level) {
        if (level == sum.size()) {
            sum.add(node.val);
        } else {
            sum.set(level, sum.get(level) + node.val);
        }
        if (node.left != null) {
            dfs(node.left, level + 1);
        }
        if (node.right != null) {
            dfs(node.right, level + 1);
        }
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
