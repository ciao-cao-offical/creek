package cn.ccy.leetcode.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/9 00:13:09
 * @description https://leetcode.cn/problems/merge-nodes-in-between-zeros/?envType=daily-question&envId=2024-09-09
 */
public class MergeNodes {
    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int total = 0;
        for (ListNode cur = head.next; cur != null; cur = cur.next) {
            if (cur.val == 0) {
                ListNode node = new ListNode(total);
                tail.next = node;
                tail = tail.next;
                total = 0;
            } else {
                total += cur.val;
            }
        }

        return dummy.next;
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
