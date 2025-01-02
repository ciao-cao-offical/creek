package cn.ccy.leetcode._2023.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/30 0030 21:52:36
 * @description https://leetcode.cn/problems/merge-in-between-linked-lists/
 */
public class MergeInBetween {
    public static void main(String[] args) {

    }

    //模拟
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode before = list1;
        for (int i = 0; i < a - 1; i++) {
            before = before.next;
        }
        ListNode after = before;
        for (int i = 0; i < b - a + 2; i++) {
            after = after.next;
        }

        before.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = after;

        return list1;
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
