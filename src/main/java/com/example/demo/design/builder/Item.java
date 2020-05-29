package com.example.demo.design.builder;


/**
 * 建造者模式顶层接口
 *
 * 提供三个方法
 * 1.定义名称
 * 2.定义包装方式
 * 3.定义价格
 */
public interface Item {

    String name();

    Packing packing();

    float price();

}
