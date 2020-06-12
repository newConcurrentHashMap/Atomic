package com.example.demo.review.structure;


public class MineThread implements Runnable {


    @Override
    public void run() {
        print();
    }

    public static void print() {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println(Thread.currentThread().getState());
        System.out.println("线程执行。。。。");
    }
}
