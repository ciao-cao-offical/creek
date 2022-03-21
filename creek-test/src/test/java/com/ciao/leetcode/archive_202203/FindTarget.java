package com.ciao.leetcode.archive_202203;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/21
 * @description https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 */
public class FindTarget {
    public static void main(String[] args) {

    }

    //迭代 + 中序遍历 + 双指针
    public boolean findTarget(TreeNode root, int k) {
        TreeNode left = root;
        TreeNode right = root;
        Deque<TreeNode> leftStack = new ArrayDeque<>();
        Deque<TreeNode> rightStack = new ArrayDeque<>();
        leftStack.push(left);
        while (left.left != null) {
            leftStack.push(left.left);
            left = left.left;
        }
        rightStack.push(right);
        while (right.right != null) {
            rightStack.push(right.right);
            right = right.right;
        }

        while (left != right) {
            if (left.val + right.val == k) {
                return true;
            }

            if (left.val + right.val < k) {
                left = getLeft(leftStack);

            } else {
                right = getRight(rightStack);
            }
        }
        return false;
    }

    private TreeNode getLeft(Deque<TreeNode> leftStack) {
        TreeNode pop = leftStack.pop();
        TreeNode node = pop.right;
        while (node != null) {
            leftStack.push(node);
            node = node.left;
        }

        return pop;
    }

    private TreeNode getRight(Deque<TreeNode> rightStack) {
        TreeNode pop = rightStack.pop();
        TreeNode node = pop.left;
        while (node != null) {
            rightStack.push(node);
            node = node.right;
        }

        return pop;
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
