package com.example.demo.review.thread.demo1.map;


import java.util.Arrays;

public class Test2 {


    public static void main(String[] args) {
        HashMapTest<Object, Object> map = new HashMapTest<>(1);

        //每次hash碰撞都会判断是转红黑树(nodeCount>8&&tableLength>64)还是直接扩容(nodeCount>8&&tableLength<64)
        for (int i = 1; i <= 12; i++) {
            map.put("节点key" + i, "节点" + i);
        }
        System.out.println(Arrays.toString(map.table));
        out(map.table[1]);
        map.remove("节点key11");
        map.remove("节点key10");
        map.remove("节点key9");
        map.remove("节点key8");
        map.remove("节点key7");
        map.remove("节点key6");
        map.remove("节点key5");
        map.remove("节点key4");
        //map.remove("节点key3");
        //map.remove("节点key2");
        out(map.table[1]);


    }

    private static void out(HashMapTest.Node<Object, Object> root1) {
        StringBuilder stringBuffer = new StringBuilder();
        HashMapTest.Node<Object, Object> root = root1;
        if (root != null) {
            stringBuffer.append(root.value);
            while (root.next != null) {
                root = root.next;
                stringBuffer.append("->" + root.value);
            }
        }

        if (root instanceof HashMapTest.TreeNode) {
            System.out.println("红黑树结构:" + stringBuffer.toString());
        } else {
            System.out.println("链表结构:" + stringBuffer.toString());
        }
    }
}
