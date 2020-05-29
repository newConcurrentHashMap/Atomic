package com.example.demo.design.observer;

/**
 * 观察者模式抽象类
 */
public abstract class Observer {

    /**
     * 持有被观察者对象的引用,并被子类（观察者）继承
     */
    protected Subject subject;

    /**
     * 接收到被观察者类变化信息后执行的处理方法
     */
    public abstract void update();
}
