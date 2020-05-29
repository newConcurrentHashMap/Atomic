package com.example.demo.springevnet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableScheduling
@RestController
public class Pusher {

    private static Logger logger = LogManager.getLogger(Pusher.class);

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    @RequestMapping("/test")
    public void push() {
        EventMsgModel eventMsgModel = new EventMsgModel();
        eventMsgModel.setMsg("发送消息");
        eventMsgModel.setName("event");
        logger.info("发送数据为:{}", eventMsgModel.toString());
        applicationEventPublisher.publishEvent(new EventSource(eventMsgModel));
    }

}
