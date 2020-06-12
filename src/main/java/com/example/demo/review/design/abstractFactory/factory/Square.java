package com.example.demo.review.design.abstractFactory.factory;


/**
 * 定义正方形实现类
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
