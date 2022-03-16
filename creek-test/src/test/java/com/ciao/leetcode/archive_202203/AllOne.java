package com.ciao.leetcode.archive_202203;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/16 0016
 * @description https://leetcode-cn.com/problems/all-oone-data-structure/
 * ☆☆☆☆☆☆ better retry
 */
public class AllOne {
    Node root;
    Map<String, Node> nodes;

    public AllOne() {
        root = new Node();
        root.prev = root;
        root.next = root;
        nodes = new HashMap<>();
    }

    public static void main(String[] args) {

    }

    public void inc(String key) {
        if (nodes.containsKey(key)) {
            Node cur = nodes.get(key);
            Node next = cur.next;
            if (next == root || next.count > cur.count + 1) {
                nodes.put(key, cur.backInsert(new Node(key, cur.count + 1)));

            } else {
                next.keys.add(key);
                nodes.put(key, next);
            }
            cur.keys.remove(key);
            if (cur.keys.isEmpty()) {
                cur.removeSelf();
            }

        } else {
            if (root.next == root || root.next.count > 1) {
                nodes.put(key, root.backInsert(new Node(key, 1)));

            } else {
                root.next.keys.add(key);
                nodes.put(key, root.next);
            }

        }
    }

    public void dec(String key) {
        Node cur = nodes.get(key);
        if (cur.count == 1) {
            nodes.remove(key);
        } else {
            Node prev = cur.prev;
            if (prev == root || prev.count < cur.count - 1) {
                nodes.put(key, cur.prev.backInsert(new Node(key, cur.count - 1)));

            } else {
                prev.keys.add(key);
                nodes.put(key, prev);
            }
        }

        cur.keys.remove(key);
        if (cur.keys.isEmpty()) {
            cur.removeSelf();
        }
    }

    public String getMaxKey() {
        return root.prev != null ? root.prev.keys.iterator().next() : "";
    }

    public String getMinKey() {
        return root.next != null ? root.next.keys.iterator().next() : "";
    }

    class Node {
        Node prev;
        Node next;
        int count;
        Set<String> keys;

        public Node() {
            this("", 0);
        }

        public Node(String key, int count) {
            this.count = count;
            keys = new HashSet<>();
            keys.add(key);
        }

        public Node backInsert(Node next) {
            next.prev = this;
            next.next = this.next;
            next.prev.next = next;
            next.next.prev = next;

            return next;
        }

        public void removeSelf() {
            this.prev.next = this.next;
            this.next.prev = this.prev;
        }
    }
}
