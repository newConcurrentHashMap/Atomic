package com.example.demo.review.thread2;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Consumer implements Runnable {

//    private Container container;
//
//    public Consumer(Container container) {
//        this.container = container;
//    }

    @Override
    public void run() {
        TreadProductConsumerTest.container.take();
    }


}
