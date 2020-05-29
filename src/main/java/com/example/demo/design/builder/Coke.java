package com.example.demo.design.builder;

/**
 * 可乐
 * 继承与冷饮抽象类->实现最顶层接口
 */
public class Coke extends ColdDrink {

    /**
     * 重写冷饮抽象类的名称定义方法
     * @return Coke
     */
    @Override
    public String name() {
        return "Coke";
    }

    /**
     * 重写冷饮抽象类的名称价格方法
     * @return 30.0f
     */
    @Override
    public float price() {
        return 30.0f;
    }
}
