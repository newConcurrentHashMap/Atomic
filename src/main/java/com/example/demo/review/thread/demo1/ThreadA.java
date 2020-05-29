package com.example.demo.review.thread.demo1;

import java.util.HashMap;
import java.util.Map;

public class ThreadA extends Thread {

    private Map<String, String> map = new HashMap<>();


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            map.put("1", "www.baidu.com" + i);
        }
        System.out.println(map);
    }

    public ThreadA() {
    }

    public ThreadA(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }
}
