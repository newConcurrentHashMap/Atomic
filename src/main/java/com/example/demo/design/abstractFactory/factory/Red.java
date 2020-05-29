package com.example.demo.design.abstractFactory.factory;

import com.example.demo.design.abstractFactory.factory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
