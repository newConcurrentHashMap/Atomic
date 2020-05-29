package com.example.demo.review.thread.demo1.map;


public class Test2 {


    public static void main(String[] args) {
        HashMapTest<Object, Object> map = new HashMapTest<>();
        map.put("卞老师1","牛逼1");
        map.put("卞老师2","牛逼2");
        map.put("卞老师3","牛逼3");
        SetTest<MapTest.Entry<Object, Object>> entries = map.entrySet();
        for (MapTest.Entry<Object, Object> entry : entries) {
            System.out.print(entry.getKey()+"-----");
            System.out.println(entry.getValue());
        }
    }
}
