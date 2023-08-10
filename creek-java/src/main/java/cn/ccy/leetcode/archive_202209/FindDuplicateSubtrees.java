package cn.ccy.leetcode.archive_202209;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/5
 * @description https://leetcode.cn/problems/find-duplicate-subtrees/
 * ⭐️⭐️⭐️ 试试【使用三元组进行唯一表示】
 */
public class FindDuplicateSubtrees {
    public static void main(String[] args) {

    }

    private final Map<String, TreeNode> seen = new HashMap<>();
    private final Set<TreeNode> repeat = new HashSet<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<TreeNode>(repeat);
    }

    private String dfs(TreeNode node) {
        if (node == null) {
            return "";
        }

        String serial = node.val +
                "(" +
                dfs(node.left) +
                ")(" +
                dfs(node.right) +
                ")";
        if (seen.containsKey(serial)) {
            repeat.add(seen.get(serial));

        } else {
            seen.put(serial, node);
        }

        return serial;
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
