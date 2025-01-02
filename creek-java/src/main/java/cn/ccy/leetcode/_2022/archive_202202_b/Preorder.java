package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/22
 * @description https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class Preorder {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            Node poll = deque.poll();
            ans.add(poll.val);

            List<Node> children = poll.children;
            if (children != null) {
                Collections.reverse(children);
                for (Node child : children) {
                    deque.offerFirst(child);
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
