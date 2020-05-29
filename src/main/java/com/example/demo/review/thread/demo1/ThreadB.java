package com.example.demo.review.thread.demo1;

public class ThreadB extends Thread {


    @Override
    public void run() {
        super.run();
    }


    public ThreadB(){
    }


    public ThreadB(ThreadGroup threadGroup,String name){
        super(threadGroup,name);
    }
}
