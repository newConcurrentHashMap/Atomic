package com.example.demo.review.design.abstractFactory.factory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
