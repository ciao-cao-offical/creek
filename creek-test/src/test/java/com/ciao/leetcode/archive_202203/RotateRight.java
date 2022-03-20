package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/18 0018
 * @description https://leetcode-cn.com/problems/rotate-list/
 */
public class RotateRight {
    public static void main(String[] args) {

    }

    //闭合为环
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        int step = count - k % count;
        if (step == count) {
            return head;
        }

        //闭合成环
        tail.next = head;
        while (step-- > 0) {
            tail = tail.next;
        }

        ListNode ans = tail.next;
        tail.next = null;
        return ans;
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
