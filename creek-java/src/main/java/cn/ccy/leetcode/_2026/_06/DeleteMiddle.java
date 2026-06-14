package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/delete-the-middle-node-of-a-linked-list/?envType=daily-question&envId=2026-06-15">2095. 删除链表的中间节点</a>
 * @since 2026/6/15 00:02
 */
public class DeleteMiddle {
    public static void main(String[] args) {

    }

    public static class ListNode {
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

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        pre.next = pre.next.next;
        return head;
    }
}
