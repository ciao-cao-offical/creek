package com.ciao.leetcode.archive_202304;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/10 15:05
 * @description https://leetcode.cn/problems/next-greater-node-in-linked-list/
 */
public class NextLargerNodes {
    public static void main(String[] args) {

    }

    // 单调栈
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        Deque<int[]> dq = new ArrayDeque<>();
        ListNode node = head;
        int idx = -1;
        while (node != null){
            ++idx;
            int val = node.val;
            ans.add(0);
            while (!dq.isEmpty() && dq.peek()[0] < val){
                ans.set(dq.pop()[1],val);
            }

            dq.push(new int[]{val,idx});
            node = node.next;
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
