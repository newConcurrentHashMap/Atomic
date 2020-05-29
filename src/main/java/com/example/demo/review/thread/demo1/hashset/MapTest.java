package com.example.demo.review.thread.demo1.hashset;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String, Model1> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("1", new Model1("11111"));
        stringStringHashMap.put("2", new Model1("22222"));
        stringStringHashMap.put("3", new Model1("33333"));
        Model1 model1 = stringStringHashMap.get("1");
        model1.setName("99999");
        model1.setAct("史蒂夫");
        write(model1.getAct());
        // print 99999
        System.out.println(stringStringHashMap.get("1").getName());
        System.out.println(stringStringHashMap.get("1").getAct());

    }

    public static void write(String act) {
        act = "是独领风骚";
    }
}
