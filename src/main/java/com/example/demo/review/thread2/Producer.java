package com.example.demo.review.thread2;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Producer implements Runnable {

    private Container container;

    public Producer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        container.put();
    }

}
