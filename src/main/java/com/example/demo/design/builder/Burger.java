package com.example.demo.design.builder;

/**
 * 汉堡抽象类，实现最顶级接口
 */
public abstract class Burger implements Item{

    /**
     * 定义包装方法
     * @return
     */
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    /**
     * 抽象方法定义价格
     * @return
     */
    @Override
    public abstract float price();
}
