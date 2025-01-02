package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17
 * @description https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int p1 = 0;
            if (l1 != null) {
                p1 = l1.val;
                l1 = l1.next;
            }
            int p2 = 0;
            if (l2 != null) {
                p2 = l2.val;
                l2 = l2.next;
            }
            int sum = p1 + p2 + carry;
            carry = sum / 10;

            if (head == null) {
                head = tail = new ListNode(sum % 10);

            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
        }
        if (carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head;
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
