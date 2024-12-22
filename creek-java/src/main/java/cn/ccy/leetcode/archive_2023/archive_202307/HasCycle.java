package cn.ccy.leetcode.archive_2023.archive_202307;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/29 0029 21:37:16
 * @description https://leetcode.cn/problems/linked-list-cycle/
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        set.add(node);
        while (node != null && node.next != null) {
            node = node.next;
            if (!set.add(node)) {
                return true;
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
