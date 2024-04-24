package cn.ccy.leetcode.archive_202404;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/24 22:25:40
 * @description https://leetcode.cn/problems/amount-of-time-for-binary-tree-to-be-infected/?envType=daily-question&envId=2024-04-24
 * ☆☆☆ 2024cvd
 */
public class AmountOfTime {
    public static void main(String[] args) {

    }
    
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        dfs(graph, root);
        Queue<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(new int[]{start, 0});
        Set<Integer> visited = new HashSet<Integer>();
        visited.add(start);
        int time = 0;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int nodeVal = arr[0];
            time = arr[1];
            for (int childVal : graph.get(nodeVal)) {
                if (visited.add(childVal)) {
                    queue.offer(new int[]{childVal, time + 1});
                }
            }
        }
        return time;
    }

    public void dfs(Map<Integer, List<Integer>> graph, TreeNode node) {
        graph.putIfAbsent(node.val, new ArrayList<Integer>());
        for (TreeNode child : Arrays.asList(node.left, node.right)) {
            if (child != null) {
                graph.get(node.val).add(child.val);
                graph.putIfAbsent(child.val, new ArrayList<Integer>());
                graph.get(child.val).add(node.val);
                dfs(graph, child);
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
