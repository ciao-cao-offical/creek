package cn.ccy.leetcode.archive_202402;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/18 0018 21:29:28
 * @description https://leetcode.cn/problems/n-ary-tree-preorder-traversal/?envType=daily-question&envId=2024-02-18
 */
public class Preorder2 {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }

    private void dfs(Node node, List<Integer> res) {
        if (node == null) {
            return;
        }

        res.add(node.val);
        if (node.children == null || node.children.isEmpty()) {
            return;
        }

        for (Node child : node.children) {
            dfs(child, res);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
