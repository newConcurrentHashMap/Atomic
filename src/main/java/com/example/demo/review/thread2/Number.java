package com.example.demo.review.thread2;

import lombok.Data;

@Data
public class Number {

    protected Integer num;

    protected synchronized void addNum() {
    }

    protected synchronized void reduceNum() {
    }


}
