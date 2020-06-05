package com.example.demo.review.thread2;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

@Slf4j
public class Container {

    //
    //private LinkTest<Integer> container = new LinkTest<>();

    //容量
    private int capacity = 10;

    private volatile int num = 0;


    public void put() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this) {
                while (num == capacity) {
                    log.info("饭桶满了.不能再加了");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ++num;
                log.info("生产者:{},加了1碗饭,饭桶中现在有:{}碗饭", Thread.currentThread().getName(), num);
                notifyAll();

            }

        }

    }

    public void take() {

        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this) {
                while (num == 0) {
                    log.info("没饭了..等着吧");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                --num;
                log.info("消费者:{},盛走了1碗饭,饭桶中还有:{}碗饭", Thread.currentThread().getName(), num);
                notifyAll();
            }
        }
    }
}
