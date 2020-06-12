package com.example.demo.review.structure;

public class ThreadC extends Thread {


    @Override
    public void run() {
        super.run();
    }


    public ThreadC(){
    }


    public ThreadC(ThreadGroup threadGroup,String name){
        super(threadGroup,name);
    }
}
