package cn.ccy.leetcode._2022.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/1
 * @description https://leetcode-cn.com/problems/binary-tree-paths/
 * ☆☆ 尝试一下【广度优先方法】
 */
public class BinaryTreePaths {
    public static void main(String[] args) {

    }

    //深度优先
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        backTrack(ans, root, "");
        return ans;
    }

    private void backTrack(List<String> ans, TreeNode node, String path) {
        if (node == null) {
            return;
        }

        StringBuilder sb = new StringBuilder(path);
        sb.append(node.val);

        if (node.left == null && node.right == null) {
            ans.add(sb.toString());

        } else {
            sb.append("->");
            String curPath = sb.toString();
            backTrack(ans, node.left, curPath);
            backTrack(ans, node.right, curPath);
        }
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
