package cn.ccy.leetcode._2025._11;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/delete-nodes-from-linked-list-present-in-array/?envType=daily-question&envId=2025-11-01">3217. 从链表中移除在数组中存在的节点</a>
 * @since 2025/11/1 17:37
 */
public class ModifiedList {
    public static void main(String[] args) {

    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        ListNode sentry = new ListNode(0, head);
        ListNode p = sentry;
        while (p.next != null) {
            if (numSet.contains(p.next.val)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return sentry.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
