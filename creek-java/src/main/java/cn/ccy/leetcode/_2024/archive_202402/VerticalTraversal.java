package cn.ccy.leetcode._2024.archive_202402;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/13 22:56
 * @description https://leetcode.cn/problems/vertical-order-traversal-of-a-binary-tree/?envType=daily-question&envId=2024-02-13
 */
public class VerticalTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<int[]>();
        dfs(root, 0, 0, nodes);
        Collections.sort(nodes, (tuple1, tuple2) -> {
            if (tuple1[0] != tuple2[0]) {
                return tuple1[0] - tuple2[0];
            } else if (tuple1[1] != tuple2[1]) {
                return tuple1[1] - tuple2[1];
            } else {
                return tuple1[2] - tuple2[2];
            }
        });
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int size = 0;
        int lastcol = Integer.MIN_VALUE;
        for (int[] tuple : nodes) {
            int col = tuple[0], row = tuple[1], value = tuple[2];
            if (col != lastcol) {
                lastcol = col;
                ans.add(new ArrayList<Integer>());
                size++;
            }
            ans.get(size - 1).add(value);
        }
        return ans;
    }

    public void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
        if (node == null) {
            return;
        }
        nodes.add(new int[]{col, row, node.val});
        dfs(node.left, row + 1, col - 1, nodes);
        dfs(node.right, row + 1, col + 1, nodes);
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
