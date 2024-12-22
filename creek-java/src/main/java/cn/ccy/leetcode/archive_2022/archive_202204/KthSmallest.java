package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/21
 * @description https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * ☆☆☆ 试试【记录子树的结点数】和【平衡二叉搜索树】
 */
public class KthSmallest {
    public static void main(String[] args) {

    }

    //搜索二叉树 中序遍历
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            --k;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }

    //递归
    /*public int kthSmallest(TreeNode root, int k) {
        Set<Integer> rank = new TreeSet<>(Integer::compareTo);
        dfs(root, rank);
        int ans = -1;
        if (rank.size() >= k) {
            for (int val : rank) {
                k--;
                if (k == 0) {
                    ans = val;
                }
            }
        }
        return ans;
    }

    private void dfs(TreeNode node, Set<Integer> rank) {
        if (node == null) {
            return;
        }
        rank.add(node.val);
        dfs(node.left, rank);
        dfs(node.right, rank);
    }*/

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
