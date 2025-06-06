package cn.ccy.leetcode._2024.archive_202402;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/17 0017 21:18:04
 * @description https://leetcode.cn/problems/n-ary-tree-level-order-traversal/?envType=daily-question&envId=2024-02-17
 */
public class LevelOrder2 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < cnt; ++i) {
                Node cur = queue.poll();
                level.add(cur.val);
                for (Node child : cur.children) {
                    queue.offer(child);
                }
            }
            ans.add(level);
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
