package com.example.demo.review.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Candies {

    public static void main(String[] args) {
        int[] ints = {3,5,2,5,1,7,4};
        int extraCandies = 5;
        List<Boolean> list = get(ints, extraCandies);
        System.out.println(list);

    }

    public static List<Boolean> get(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        int length = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {
            list.add((candies[i] + extraCandies) >= maxCandies);
        }
        return list;
    }
}
