package com.example.demo.review.thread.pcmodel;

import com.example.demo.review.thread.pcmodel.Container;
import com.example.demo.review.thread.pcmodel.Dog;
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
