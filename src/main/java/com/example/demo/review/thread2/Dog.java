package com.example.demo.review.thread2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Dog implements Runnable{

    private CyclicBarrier cyclicBarrier;


    public Dog(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {

        Thread producer1 = new Thread(new Producer());

        Thread consumer1 = new Thread(new Consumer());

        producer1.start();
        consumer1.start();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
