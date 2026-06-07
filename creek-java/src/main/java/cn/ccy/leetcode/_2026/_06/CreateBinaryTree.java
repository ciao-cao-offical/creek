package cn.ccy.leetcode._2026._06;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/create-binary-tree-from-descriptions/?envType=daily-question&envId=2026-06-07">2196. 根据描述创建二叉树</a>
 * @since 2026/6/7 20:38
 */
public class CreateBinaryTree {
    public static void main(String[] args) {

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

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, Boolean> isRoot = new HashMap<>();  // 数值对应的节点是否为根节点的哈希表
        Map<Integer, TreeNode> nodes = new HashMap<>();  // 数值与对应节点的哈希表

        for (int[] d : descriptions) {
            int p = d[0];
            int c = d[1];
            boolean left = d[2] == 1;

            if (!isRoot.containsKey(p)) {
                isRoot.put(p, true);
            }
            isRoot.put(c, false);

            // 创建或更新节点
            if (!nodes.containsKey(p)) {
                nodes.put(p, new TreeNode(p));
            }
            if (!nodes.containsKey(c)) {
                nodes.put(c, new TreeNode(c));
            }

            if (left) {
                nodes.get(p).left = nodes.get(c);
            } else {
                nodes.get(p).right = nodes.get(c);
            }
        }

        // 寻找根节点
        int root = -1;
        for (Map.Entry<Integer, Boolean> entry : isRoot.entrySet()) {
            if (entry.getValue()) {
                root = entry.getKey();
                break;
            }
        }

        return nodes.get(root);
    }
}
