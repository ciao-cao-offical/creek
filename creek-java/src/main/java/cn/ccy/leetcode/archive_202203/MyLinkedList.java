package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/21
 * @description https://leetcode-cn.com/problems/design-linked-list/
 * ☆☆ 试试【双向链表实现】
 */
public class MyLinkedList {
    private int count;
    private ListNode head;

    public MyLinkedList() {
        count = 0;
        head = new ListNode(0);
    }

    public static void main(String[] args) {

    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i < index + 1; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(count, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > count) {
            return;
        }

        if (index < 0) {
            index = 0;
        }
        count++;
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        ListNode nodeToAdd = new ListNode(val);
        nodeToAdd.next = cur.next;
        cur.next = nodeToAdd;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= count) {
            return;
        }
        count--;
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
