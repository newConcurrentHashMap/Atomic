package com.example.demo.review.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐定义类
 */
public class Meal {

    /**
     * 持有顶层接口对象列表
     */
    List<Item> itemList = new ArrayList<>();

    /**
     * 添加item子类进入这个维护列表
     * @param item
     */
    public void addItem(Item item) {
        itemList.add(item);
    }

    /**
     * 获取维护列表中item子类的所有价格花费
     * @return
     */
    public float getCost() {
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }


    /**
     * 获取维护列表中item子类的最终信息
     */
    public void showItems() {
        for (Item item : itemList) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().packing());
            System.out.println(", Price : "+item.price());
        }
    }
}
