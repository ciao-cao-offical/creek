package cn.ccy.leetcode.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/3 0003 02:04:49
 * @description https://leetcode.cn/problems/remove-nodes-from-linked-list/?envType=daily-question&envId=2024-01-03
 */
public class RemoveNodes {
    public static void main(String[] args) {

    }

    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        head.next = removeNodes(head.next);
        if (head.next != null && head.val < head.next.val) {
            return head.next;
        } else {
            return head;
        }
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
