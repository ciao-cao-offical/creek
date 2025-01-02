package cn.ccy.leetcode._2022.archive_202203;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/11
 * @description https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 */
public class LevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Deque<Node> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> part = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node pop = deque.pop();
                part.add(pop.val);
                if (pop.children != null) {
                    for (Node child : pop.children) {
                        deque.offer(child);
                    }
                }
            }
            ans.add(part);
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
