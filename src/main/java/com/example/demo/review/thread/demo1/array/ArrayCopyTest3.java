package com.example.demo.review.thread.demo1.array;

import java.util.Arrays;

public class ArrayCopyTest3 {

    public static void main(String[] args) {
        String[] arr1= {"1","2","3"};
        Integer[] arr2 = new Integer[arr1.length];
        Object[] objects = Arrays.copyOf(arr1, 3, arr2.getClass());

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }

}
