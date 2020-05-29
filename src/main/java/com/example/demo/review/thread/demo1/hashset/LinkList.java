package com.example.demo.review.thread.demo1.hashset;


import java.util.Collection;

public class LinkList<T> {

    private Node<T> first;

    private Node<T> last;

    private transient int size;

    private transient int modCount;


    //头插
    public void linkFirst(T item) {

        Node<T> f = first;
        Node<T> newNode = new Node<>(item, null, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
        modCount++;

    }


    //尾插
    public void linkLast(T item) {

        Node<T> l = this.last;
        Node<T> newNode = new Node<>(item, l, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        modCount++;

    }

    public void addAll(Collection<? extends T> c) {

    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        if (index+1 == size) {
            removeLast();
            return;
        }
        Node<T> targetNode = node(index);
        Node<T> nextNode = targetNode.next;
        Node<T> prevNode = targetNode.prev;
        targetNode.next = null;
        targetNode.item = null;
        targetNode.prev = null;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;


    }

    //删除头节点
    private void removeFirst() {
        Node<T> f = first;
        Node<T> next = f.next;
        f.next = null;
        f.item = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        modCount++;
    }

    //删除尾节点
    private void removeLast() {
        Node<T> l = last;
        Node<T> prev = l.prev;
        l.item = null;
        l.next = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
    }

    //某个链表下标更新值
    public T set(int index, T item) {
        Node<T> node = node(index);
        T oldValue = node.item;
        node.item = item;
        return oldValue;
    }


    //获取某个下标的值
    public T get(int index) {
        return node(index).item;
    }


    //某个节点前插入数据
    public void linkBefore(T item, Node<T> node) {
        Node<T> preNode = node.prev;

        if (preNode == null) {
            linkFirst(item);
        } else {
            Node<T> newNode = new Node<>(item, preNode, node);
            node.prev = newNode;
            preNode.next = newNode;
        }

    }


    public Node<T> node(int index) {

        //如果index在size的左边,调用头指针节点开始查找
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {

            //index在size右边,调用尾指针节点开始查找
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }


    //自定义输出链表元素
    public StringBuffer out() {
        StringBuffer stringBuffer = new StringBuffer();
        Node<T> f = first;
        if (f != null) {
            stringBuffer.append(f.item);
            while (f.next != null) {
                f = f.next;
                stringBuffer.append(f.item);
            }
        }
        return stringBuffer;
    }


    class Node<T> {

        private T item;
        private Node<T> prev;
        private Node<T> next;

        public Node() {
        }

        private Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

    }
}
