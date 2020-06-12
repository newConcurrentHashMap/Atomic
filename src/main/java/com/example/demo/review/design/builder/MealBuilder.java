package com.example.demo.review.design.builder;


/**
 * 建造者类
 */
public class MealBuilder {

    /**
     * 构造素食套餐
     * @return {@link Meal}
     */
    public Meal prepareVegMeal(){
      Meal meal = new Meal();

      //加入素食汉堡和可乐到维护列表中
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
    }

    /**
     * 构造肉食套餐
     * @return {@link Meal}
     */
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();

        //加入肉食汉堡和百事到维护列表中
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
