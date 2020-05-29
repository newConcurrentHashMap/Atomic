package com.example.demo.design.observer;

/**
 * 二进制观察者
 */
public class BinaryObserver extends Observer{

    /**
     * 构造方法会把自己放入被观察者持有的观察者列表中
     * @param subject 被观察者对象
     */
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    /**
     * 具体执行方法
     */
    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
