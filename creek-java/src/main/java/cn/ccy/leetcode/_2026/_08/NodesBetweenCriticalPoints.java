package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/?envType=daily-question&envId=2026-08-31">...</a>
 * @since 2026/8/31 01:08
 */
public class NodesBetweenCriticalPoints {
    public static void main(String[] args) {

    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDist = -1, maxDist = -1;
        int first = -1, last = -1, pos = 0;
        ListNode cur = head;
        while (cur.next.next != null) {
            // 获取连续的三个节点的值
            int x = cur.val;
            int y = cur.next.val;
            int z = cur.next.next.val;
            // 如果 y 是临界点
            if (y > Math.max(x, z) || y < Math.min(x, z)) {
                if (last != -1) {
                    // 用相邻临界点的距离更新最小值
                    minDist = (minDist == -1 ? pos - last : Math.min(minDist, pos - last));
                    // 用到第一个临界点的距离更新最大值
                    maxDist = Math.max(maxDist, pos - first);
                }
                if (first == -1) {
                    first = pos;
                }
                // 更新上一个临界点
                last = pos;
            }
            cur = cur.next;
            ++pos;
        }
        return new int[]{minDist, maxDist};
    }

    public static class ListNode {
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
