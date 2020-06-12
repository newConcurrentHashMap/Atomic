package com.example.demo.review.leetcode;


public class MergeArrayCondition {



    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        //int[] result = {1, 5, 2, 6, 3, 7, 5, 8};
        int[] ints = reSort2(num, num.length/2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    //重新排列数组
    public static int[] reSort(int[] num, int n) {
        int[] result = new int[2*n];
        for (int i = 0; i < 2 * n; i++) {
            int j = i < n ? 2 * i : 2 * (i - n) + 1;
            num[j] |= (num[i] & 1023) << 10;
        }
        for (int i = 0; i < num.length; i++) {
            result[i] = num[i] >>= 10;
        }
        return result;

    }

    public static int[] reSort2(int[] nums,int n){

        int index = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n+i];
        }
        return result;
    }


}
