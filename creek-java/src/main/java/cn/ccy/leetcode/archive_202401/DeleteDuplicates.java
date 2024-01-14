package cn.ccy.leetcode.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/14 0014 18:51:06
 * @description https://leetcode.cn/problems/remove-duplicates-from-sorted-list/?envType=daily-question&envId=2024-01-14
 */
public class DeleteDuplicates {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        int currentValue = -101;
        ListNode fakeHead = new ListNode(currentValue, head);
        ListNode temp = fakeHead;
        while (temp.next != null) {
            if (temp.next.val == currentValue) {
                temp.next = temp.next.next;
                
            } else {
                currentValue = temp.next.val;
                temp = temp.next;
            }
        }
        return fakeHead.next;
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
