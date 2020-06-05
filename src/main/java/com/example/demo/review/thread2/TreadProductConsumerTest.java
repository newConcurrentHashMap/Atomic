package com.example.demo.review.thread2;

import org.junit.Test;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class TreadProductConsumerTest {


    public static Container container = new Container();

    @Test
    public void test() throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(500);

        for (int i = 0; i < 500; i++) {
            new Thread(new Dog(cyclicBarrier)).start();
        }


        TimeUnit.SECONDS.sleep(10);
    }
}
