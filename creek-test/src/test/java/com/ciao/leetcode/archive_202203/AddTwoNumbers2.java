package com.ciao.leetcode.archive_202203;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17
 * @description https://leetcode-cn.com/problems/add-two-numbers-ii/
 */
public class AddTwoNumbers2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> sl1 = new LinkedList<>();
        while (l1 != null) {
            sl1.push(l1.val);
            l1 = l1.next;
        }
        Deque<Integer> sl2 = new LinkedList<>();
        while (l2 != null) {
            sl2.push(l2.val);
            l2 = l2.next;
        }

        ListNode ans = null;
        int carry = 0;
        while (!sl1.isEmpty() || !sl2.isEmpty() || carry != 0) {
            int p1 = sl1.isEmpty() ? 0 : sl1.pop();
            int p2 = sl2.isEmpty() ? 0 : sl2.pop();
            int sum = p1 + p2 + carry;
            carry = sum / 10;
            ListNode cur = new ListNode(sum % 10);
            cur.next = ans;
            ans = cur;
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
