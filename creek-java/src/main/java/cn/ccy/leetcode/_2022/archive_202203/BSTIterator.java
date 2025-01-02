package cn.ccy.leetcode._2022.archive_202203;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/18 0018
 * @description https://leetcode-cn.com/problems/binary-search-tree-iterator/
 * ☆☆ 试一下【迭代-栈】
 */
public class BSTIterator {
    int index;
    List<Integer> valueList;

    //扁平化
    public BSTIterator(TreeNode root) {
        index = 0;
        valueList = new ArrayList<>();
        transToList(root, valueList);
    }

    public static void main(String[] args) {

    }

    private void transToList(TreeNode node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }

        transToList(node.left, nodeList);
        nodeList.add(node.val);
        transToList(node.right, nodeList);
    }

    public int next() {
        return valueList.get(index++);
    }

    public boolean hasNext() {
        return index <= valueList.size() - 1;
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
