package com.example.demo.design.builder;

/**
 * 冷饮抽象类
 *
 */
public abstract class ColdDrink implements Item{

    /**
     * 定义具体包装的方法：瓶子包装
     * @return {@link Bottle}
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    /**
     * 抽象方法定义价格
     */
    @Override
    public abstract float price();
}
