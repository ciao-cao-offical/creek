package cn.ccy.leetcode.archive_2022.archive_202203;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/16 0016
 * @description https://leetcode-cn.com/problems/reorder-list/
 */
public class ReorderList {
    public static void main(String[] args) {
    }

    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;
            cur = next;
            deque.push(next);
        }

        cur = head;
        int count = 1;
        while (!deque.isEmpty()) {
            ListNode node;
            if (count % 2 == 1) {
                node = deque.pop();

            } else {
                node = deque.pollLast();
            }
            cur.next = node;
            cur = node;
            ++count;

        }
        cur.next = null;
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


