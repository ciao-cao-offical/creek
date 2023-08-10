package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17 0017
 * @description https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class DetectCycle {
    public static void main(String[] args) {

    }

    //快慢指针
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            slow = slow.next;

            if (fast.next != null) {
                fast = fast.next.next;

            } else {
                return null;
            }

            if (slow == fast) {
                ListNode tag = head;
                while (tag != slow) {
                    tag = tag.next;
                    slow = slow.next;
                }
                return tag;
            }
        }

        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
