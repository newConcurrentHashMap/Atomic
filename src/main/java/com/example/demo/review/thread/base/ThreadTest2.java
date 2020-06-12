package com.example.demo.review.thread.base;

import java.util.concurrent.TimeUnit;

public class ThreadTest2 {

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2();
        new Thread(threadTest2::test1, "test1").start();
        new Thread(threadTest2::test2, "test2").start();

    }


    private void test1() {
        System.out.println("t1 start...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("t1 end...");

    }


    private synchronized void test2() {

        System.out.println("t2 start...");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t2 end...");
    }
}
