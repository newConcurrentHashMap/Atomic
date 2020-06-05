package com.example.demo.review.array;

public class ArrayCopyTest2 {

    public static void main(String[] args) {


        //将数组去重 并去掉0组成一个新的数组
        int[] arr1 = {1, 0, 3, 4, 0, 4, 0};
        int[] arr2 = new int[arr1.length - 1];
        System.arraycopy(arr1, 0, arr2, 0, 2);

    }

}
