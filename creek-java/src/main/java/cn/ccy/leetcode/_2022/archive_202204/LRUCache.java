package cn.ccy.leetcode._2022.archive_202204;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/12
 * @description https://leetcode-cn.com/problems/lru-cache/
 */
public class LRUCache {
    Node head;
    Node tail;
    private Map<Integer, LRUCache.Node> map;
    private int size;
    private int capacity;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new LRUCache.Node();
        this.tail = new LRUCache.Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public static void main(String[] args) {

    }

    public int get(int key) {
        LRUCache.Node node = map.get(key);
        if (node == null) {
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        LRUCache.Node node = map.get(key);
        //包含该key
        if (node != null) {
            node.value = value;
            //将该key移到链表头
            moveToHead(node);

        } else {
            //不包含该key
            Node newNode = new Node(key, value);
            size++;
            map.put(key, newNode);
            addToHead(newNode);

            if (size > capacity) {
                Node prev = tail.prev;
                map.remove(prev.key);
                removeNode(prev);
                size--;
            }
        }
    }

    private void moveToHead(LRUCache.Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(LRUCache.Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(LRUCache.Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
