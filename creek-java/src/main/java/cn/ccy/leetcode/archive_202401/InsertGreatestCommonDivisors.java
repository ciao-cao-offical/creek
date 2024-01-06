package cn.ccy.leetcode.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/6 0006 17:30:21
 * @description https://leetcode.cn/problems/insert-greatest-common-divisors-in-linked-list/description/?envType=daily-question&envId=2024-01-06
 */
public class InsertGreatestCommonDivisors {
    public static void main(String[] args) {

    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            node.next = new ListNode(gcd(node.val, node.next.val), node.next);
            node = node.next.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
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
