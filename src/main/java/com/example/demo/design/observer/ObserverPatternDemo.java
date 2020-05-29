package com.example.demo.design.observer;

/**
 * 测试类
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        //初始化被观察者
        Subject subject = new Subject();

        //初始化观察者，并注册自己到观察者列表
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        //被观察者发出数值改变会通知列表中的观察者
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
