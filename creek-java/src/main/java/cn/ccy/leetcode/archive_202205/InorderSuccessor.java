package cn.ccy.leetcode.archive_202205;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/16 0016
 * @description https://leetcode.cn/problems/successor-lcci/
 * ☆☆☆ 试试【方法二：利用二叉搜索树的性质】
 * 和【BST 特性 + 递归】-【宫水三叶】https://leetcode.cn/problems/successor-lcci/solution/by-ac_oier-xib5/
 */
public class InorderSuccessor {
    public static void main(String[] args) {

    }

    //中序遍历
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        TreeNode prev = null;
        TreeNode curr = root;
        while (!dq.isEmpty() || curr != null) {
            while (curr != null) {
                dq.push(curr);
                curr = curr.left;
            }
            curr = dq.pop();
            if (prev == p) {
                return curr;
            }
            prev = curr;
            curr = curr.right;

        }
        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
