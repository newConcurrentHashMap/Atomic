package com.example.demo.review.thread.demo1.map;


import java.util.Arrays;

public class ConcurrentHashMapTest2 {


    public static void main(String[] args) {
        ConcurrentHashMapTest<Object, Object> map = new ConcurrentHashMapTest<>(1);
        map.put("元素1","啦啦啦1");
        map.put("元素2","啦啦啦2");
        map.put("元素3","啦啦啦3");
        System.out.println(map.sizeCtl);
        ConcurrentHashMapTest.Node<Object, Object>[] table = map.table;
        if (table != null && table.length > 0) {
            for (int i = 0; i < table.length; i++) {
                System.out.println(table[i]);
            }
        }
        System.out.println(Arrays.toString(table));
    }
}
