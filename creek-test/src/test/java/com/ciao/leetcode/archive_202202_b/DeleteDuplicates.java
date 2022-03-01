package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/5
 * @description https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class DeleteDuplicates {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fakeHead = new ListNode(0, head);

        ListNode cur = fakeHead;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int cv = cur.next.val;
                while (cur.next != null && cur.next.val == cv) {
                    cur.next = cur.next.next;
                }

            } else {
                cur = cur.next;
            }

        }

        return fakeHead.next;
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
