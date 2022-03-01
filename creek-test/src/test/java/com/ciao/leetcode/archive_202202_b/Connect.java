package com.ciao.leetcode.archive_202202_b;

import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/23
 * @description https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 */
public class Connect {
    public static void main(String[] args) {

    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        LinkedList<Node> nodes = new LinkedList<>();
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                Node poll = nodes.poll();
                if (i < size - 1) {
                    poll.next = nodes.peek();
                }

                if (poll.left != null) {
                    nodes.offer(poll.left);
                }

                if (poll.right != null) {
                    nodes.offer(poll.right);
                }
            }
        }

        return root;
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}
