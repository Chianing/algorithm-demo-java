package com.chianing.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU缓存
 * <a href="https://leetcode-cn.com/problems/lru-cache/">https://leetcode-cn.com/problems/lru-cache/</a>
 */
public class Q146_LRUCache {

    private final int capacity;
    private final Map<Integer, DLinkedNode> dataMap;
    private final DLinkedNode tmpHead, tmpTail;

    public Q146_LRUCache(int capacity) {
        this.dataMap = new HashMap<>();
        this.capacity = capacity;
        this.tmpHead = new DLinkedNode();
        this.tmpTail = new DLinkedNode();
        this.tmpHead.setNext(this.tmpTail);
        this.tmpTail.setPre(this.tmpHead);
    }

    public int get(int key) {
        if (dataMap.size() == 0 || !dataMap.containsKey(key)) {
            return -1;
        }

        DLinkedNode result = dataMap.get(key);
        moveToHead(result);

        return result.getVal();
    }

    public void put(int key, int value) {
        if (!dataMap.containsKey(key)) {
            DLinkedNode node = new DLinkedNode(key, value);
            dataMap.put(key, node);
            addToHead(node);
            if (dataMap.size() > capacity) {
                DLinkedNode tail = tmpTail.getPre();
                removeNode(tail);
                dataMap.remove(tail.getKey());
            }
            return;
        }

        DLinkedNode node = dataMap.get(key);
        node.setVal(value);
        moveToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        DLinkedNode pre = node.getPre();
        DLinkedNode next = node.getNext();

        pre.setNext(next);
        next.setPre(pre);
    }

    private void addToHead(DLinkedNode node) {
        DLinkedNode next = tmpHead.getNext();
        tmpHead.setNext(node);
        node.setPre(tmpHead);
        node.setNext(next);
        next.setPre(node);
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    public DLinkedNode getTmpHead() {
        return tmpHead;
    }

    static class DLinkedNode {
        private int key;
        private int val;

        private DLinkedNode next;
        private DLinkedNode pre;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public DLinkedNode getNext() {
            return next;
        }

        public void setNext(DLinkedNode next) {
            this.next = next;
        }

        public DLinkedNode getPre() {
            return pre;
        }

        public void setPre(DLinkedNode pre) {
            this.pre = pre;
        }
    }

}
