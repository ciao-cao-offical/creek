package com.ciao.leetcode.archive_202203;

import java.util.HashSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17
 * @description https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * ☆☆ 尝试一下【双指针方法】
 */
public class GetIntersectionNode {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
