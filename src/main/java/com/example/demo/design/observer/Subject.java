package com.example.demo.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    /**
     * 观察者维护列表
     */
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 特定属性的set方法
     * @param state
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 给观察者暴露出的加入观察者列表方法
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 执行观察者抽象类的收到通知处理,继承抽象类的会被执行具体方法
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
