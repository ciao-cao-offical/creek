package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/12
 * @description https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/
 */
public class Connect2 {
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
            Node last = null;
            for (int i = 1; i <= size; i++) {
                Node poll = nodes.poll();
                if (poll == null) {
                    continue;
                }
                if (poll.left != null) {
                    nodes.add(poll.left);
                }
                if (poll.right != null) {
                    nodes.add(poll.right);
                }
                if (i != 1 && last != null) {
                    last.next = poll;
                }
                last = poll;
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
}
