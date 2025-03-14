package cn.ccy.leetcode._2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/5 0005 22:20:20
 * @description https://leetcode.cn/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                temp.next = list2;
                list2 = list2.next;

            } else if (list2 == null) {
                temp.next = list1;
                list1 = list1.next;

            } else {
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
            }

            temp = temp.next;
        }
        return head.next;
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
