package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/?envType=daily-question&envId=2025-07-14">1290. 二进制链表转整数</a>
 * @since 2025/7/14 23:07
 */
public class GetDecimalValue {
    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        ListNode curNode = head;
        int ans = 0;
        while (curNode != null) {
            ans = ans * 2 + curNode.val;
            curNode = curNode.next;
        }
        return ans;
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
