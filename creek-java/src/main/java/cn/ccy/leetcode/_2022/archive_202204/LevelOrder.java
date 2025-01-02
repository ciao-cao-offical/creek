package cn.ccy.leetcode._2022.archive_202204;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/8
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
        Deque<Node> dq = new ArrayDeque<>();
        dq.offer(root);
        while (!dq.isEmpty()) {
            int size = dq.size();
            List<Integer> pa = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node pop = dq.pop();
                pa.add(pop.val);
                for (Node child : pop.children) {
                    dq.offer(child);
                }
            }
            ans.add(pa);
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
}
