package cn.ccy.leetcode.archive_2023.archive_202311;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/3 0003 00:46:17
 * @description https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/?envType=daily-question&envId=2023-11-03
 * ☆☆☆ 2023b2t
 */
public class Connect {
    public static void main(String[] args) {

    }

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            Node last = null;
            for (int i = 1; i <= n; ++i) {
                Node f = queue.poll();
                if (f.left != null) {
                    queue.offer(f.left);
                }
                if (f.right != null) {
                    queue.offer(f.right);
                }
                if (i != 1) {
                    last.next = f;
                }
                last = f;
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
