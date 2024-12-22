package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/29 0029
 * @description https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        merge(head, list1, list2);
        return head.next;
    }

    private void merge(ListNode head, ListNode list1, ListNode list2) {
        if (list1 == null) {
            head.next = list2;
            return;
        }
        if (list2 == null) {
            head.next = list1;
            return;
        }

        if (list1.val < list2.val) {
            head.next = list1;
            list1 = list1.next;

        } else {
            head.next = list2;
            list2 = list2.next;
        }

        merge(head.next, list1, list2);
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
