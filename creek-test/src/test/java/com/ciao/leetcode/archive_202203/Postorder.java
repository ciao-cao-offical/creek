package com.ciao.leetcode.archive_202203;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/12
 * @description https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 */
public class Postorder {
    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            Node pop = deque.pop();
            ans.add(pop.val);
            if (pop.children != null) {
                for (Node child : pop.children) {
                    deque.push(child);
                }
            }
        }

        int size = ans.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = ans.get(i);
            ans.set(i, ans.get(size - 1 - i));
            ans.set(size - 1 - i, temp);
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
