package com.hanci.medium;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private class Node {
        int key;
        int value;
        Node previous;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertToFront(node);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.previous;
                remove(lru);
                map.remove(lru.key);
            }

            Node node = new Node(key, value);
            insertToFront(node);
            map.put(key, node);
        }
    }

    private void remove(Node node) {
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private void insertToFront(Node node) {
        node.next = head.next;
        node.previous = head;
        head.next.previous = node;
        head.next = node;
    }
}
