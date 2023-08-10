package cn.ccy.leetcode.archive_202203;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/10
 * @description https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class Preorder {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        if (root.children == null) {
            ans.add(root.val);
            return ans;
        }

        Deque<Node> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            Node pop = deque.pop();
            ans.add(pop.val);
            List<Node> children = pop.children;
            if (children != null) {
                int len = children.size();
                for (int i = len - 1; i >= 0; i--) {
                    deque.push(children.get(i));
                }
            }
        }
        return ans;
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
