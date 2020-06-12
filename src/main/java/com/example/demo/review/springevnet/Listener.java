package com.example.demo.review.springevnet;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @EventListener(classes = EventSource.class)
    public void listen (EventSource eventSource){
        System.out.println("执行监听方法:"+ eventSource.toString());
    }
}
