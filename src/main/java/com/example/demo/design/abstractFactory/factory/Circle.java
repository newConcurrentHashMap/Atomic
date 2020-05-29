package com.example.demo.design.abstractFactory.factory;

import com.example.demo.design.abstractFactory.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
