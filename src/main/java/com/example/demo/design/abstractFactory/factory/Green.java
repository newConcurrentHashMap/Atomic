package com.example.demo.design.abstractFactory.factory;

import com.example.demo.design.abstractFactory.factory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
