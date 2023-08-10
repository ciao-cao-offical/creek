package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17 0017
 * @description https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-pai-xu-lian-biao-by-leetcode-solutio-2/
 * ☆☆☆☆☆ 尝试一下【分治合并】和【优先队列合并】
 */
public class MergeKLists {
    public static void main(String[] args) {

    }

    //顺序合并
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (ListNode node : lists) {
            ans = merge2Lists(ans, node);
        }
        return ans;
    }

    private ListNode merge2Lists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a == null ? b : a;
        }

        ListNode head = new ListNode();
        ListNode tail = head;
        ListNode aPtr = a;
        ListNode bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;

            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }

            tail = tail.next;
        }

        tail.next = aPtr != null ? aPtr : bPtr;

        return head.next;
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
