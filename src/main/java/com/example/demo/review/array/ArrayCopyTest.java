package com.example.demo.review.array;

public class ArrayCopyTest {

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3,4};
//        int nthreads = 4;
//        for (int i = 0; i < arr1.length; i++) {
//            if(i==0) {
//
//                System.arraycopy(arr1, i + 1, arr1, i, --nthreads - i);
//            }
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("数据---" + arr1[i]);
//        }

        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];
        int length = 0;
        System.arraycopy(arr1, 0, arr2, 0, 2);


        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                length++;
            }
            System.out.println("数据---" + arr2[i]);
        }


        int[] arr3 = new int[length];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                arr3[i]= arr2[i];
                System.out.println("\n新数组数据---" + arr3[i]);
            }
        }



//        int[] arr1 = {1,2,3};
//        System.arraycopy(arr1,0,arr1,0,2);
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("数据---" + arr1[i]);
//        }
    }

}
