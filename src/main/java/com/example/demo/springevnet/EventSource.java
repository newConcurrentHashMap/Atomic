package com.example.demo.springevnet;

import org.springframework.context.ApplicationEvent;


public class EventSource extends ApplicationEvent {


    public EventSource(EventMsgModel eventMsgModel) {
        super(eventMsgModel);
    }


}
