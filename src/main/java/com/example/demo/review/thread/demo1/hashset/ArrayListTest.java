package com.example.demo.review.thread.demo1.hashset;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list1.retainAll(list2);
        list1.forEach(System.out::println);
        System.out.println(list1.size());
    }
}
