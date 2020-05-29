package com.example.demo.design.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        //初始化建造者
        MealBuilder mealBuilder = new MealBuilder();

        //创建一个素食套餐,并获取其中的信息
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        //创建一个肉食套餐,并获取其中的信息
        Meal nonVegMeal= mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());


    }
}
