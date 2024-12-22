package cn.ccy.leetcode.archive_2022.archive_202205;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/1 0001
 * @description https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/
 */
public class GetAllElements {
    public static void main(String[] args) {

    }


    //中序遍历 + 深度优先 + 归并排序
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> n1 = new ArrayList<>();
        inOrder(root1, n1);
        List<Integer> n2 = new ArrayList<>();
        inOrder(root2, n2);

        List<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (true) {
            if (p1 == n1.size()) {
                ans.addAll(n2.subList(p2, n2.size()));
                break;
            }
            if (p2 == n2.size()) {
                ans.addAll(n1.subList(p1, n1.size()));
                break;
            }

            if (n1.get(p1) < n2.get(p2)) {
                ans.add(n1.get(p1));
                p1++;

            } else {
                ans.add(n2.get(p2));
                p2++;
            }
        }
        return ans;
    }

    private void inOrder(TreeNode node, List<Integer> n) {
        if (node == null) {
            return;
        }

        inOrder(node.left, n);
        n.add(node.val);
        inOrder(node.right, n);
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
