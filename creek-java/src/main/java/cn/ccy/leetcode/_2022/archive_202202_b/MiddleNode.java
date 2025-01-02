package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/20
 * @description https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {
    public static void main(String[] args) {

    }

    /* //快慢指针法
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }*/

    //单指针法
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        cur = head;
        int k = 0;
        while (k < (count / 2)) {
            k++;
            cur = cur.next;
        }

        return cur;
    }


    class ListNode {
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


