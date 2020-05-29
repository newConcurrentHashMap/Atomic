package com.example.demo.design.builder;

/**
 * 具体包装实现类: 瓶装
 */
public class Bottle implements Packing {

    @Override
    public String packing() {
        return "Bottle";
    }
}
