package cn.ccy.leetcode.archive_202402;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/22 0022 23:17:36
 * @description https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/?envType=daily-question&envId=2024-02-22
 * ☆☆☆ cvd
 */
public class ConstructFromPrePost {
    public static void main(String[] args) {

    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        Map<Integer, Integer> postMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            postMap.put(postorder[i], i);
        }
        return dfs(preorder, postorder, postMap, 0, n - 1, 0, n - 1);
    }

    public TreeNode dfs(int[] preorder, int[] postorder, Map<Integer, Integer> postMap, int preLeft, int preRight, int postLeft, int postRight) {
        if (preLeft > preRight) {
            return null;
        }
        int leftCount = 0;
        if (preLeft < preRight) {
            leftCount = postMap.get(preorder[preLeft + 1]) - postLeft + 1;
        }
        return new TreeNode(preorder[preLeft],
                dfs(preorder, postorder, postMap, preLeft + 1, preLeft + leftCount, postLeft, postLeft + leftCount - 1),
                dfs(preorder, postorder, postMap, preLeft + leftCount + 1, preRight, postLeft + leftCount, postRight - 1));
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
