package cn.ccy.leetcode.archive_2024.archive_202402;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/23 0023 21:48:09
 * @description https://leetcode.cn/problems/kth-largest-sum-in-a-binary-tree/?envType=daily-question&envId=2024-02-23
 * ☆☆☆ cvd
 */
public class KthLargestLevelSum {
    public static void main(String[] args) {

    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        List<Long> levelSumArray = new ArrayList<Long>();
        while (!queue.isEmpty()) {
            List<TreeNode> levelNodes = new ArrayList<TreeNode>(queue);
            long levelSum = 0;
            queue.clear();
            for (TreeNode node : levelNodes) {
                levelSum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levelSumArray.add(levelSum);
        }
        if (levelSumArray.size() < k) {
            return -1;
        }
        Collections.sort(levelSumArray);
        return levelSumArray.get(levelSumArray.size() - k);
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
