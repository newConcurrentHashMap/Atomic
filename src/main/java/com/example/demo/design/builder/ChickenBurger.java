package com.example.demo.design.builder;

/**
 * 鸡肉汉堡
 * 继承与汉堡抽象类->实现最顶层接口
 */
public class ChickenBurger extends Burger {

    /**
     * 重写抽象类中的定义名称方法
     * @return
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }

    /**
     * 重写定义价格方法
     * @return
     */
    @Override
    public float price() {
        return 50.5f;
    }
}
