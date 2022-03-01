package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/27
 * @description https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class GetDecimalValue {
    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int ans = cur.val;
        while (cur.next != null) {
            ans = ans * 2 + cur.next.val;
            cur = cur.next;
        }
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
