package cn.ccy.leetcode._2023.archive_202307;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/30 0030 22:11:58
 * @description https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class DetectCycle {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        set.add(head);
        while (head.next != null) {
            head = head.next;
            if (!set.add(head)) {
                return head;
            }
        }
        return null;
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
