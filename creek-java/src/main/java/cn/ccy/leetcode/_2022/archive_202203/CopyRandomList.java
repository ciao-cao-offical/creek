package cn.ccy.leetcode._2022.archive_202203;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/16 0016
 * @description https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 * ☆☆ 再试一下【迭代 + 节点拆分】方式！
 */
public class CopyRandomList {
    Map<Node, Node> map = new HashMap<>();

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        if (!map.containsKey(head)) {
            Node node = new Node(head.val);
            map.put(head, node);
            node.random = copyRandomList(head.random);
            node.next = copyRandomList(head.next);
        }

        return map.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}


