package com.example.demo.review.structure;

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
