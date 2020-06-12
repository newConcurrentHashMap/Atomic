package com.example.demo.review.design.abstractFactory;

import com.example.demo.review.design.abstractFactory.factory.Color;
import com.example.demo.review.design.abstractFactory.factory.Shape;

import java.util.Objects;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory  colorFactory= FactoryProducer.getFactory("COLOR");


        if(Objects.nonNull(shapeFactory)&&Objects.nonNull(colorFactory)) {
            
            //获取颜色
            Shape circle = shapeFactory.getShape("CIRCLE");
            circle.draw();

            Shape rectangle = shapeFactory.getShape("RECTANGLE");
            rectangle.draw();

            Shape square = shapeFactory.getShape("SQUARE");
            square.draw();


            //获取颜色
            Color red = colorFactory.getColor("RED");
            red.fill();

            Color green = colorFactory.getColor("GREEN");
            green.fill();

            Color blue = colorFactory.getColor("BLUE");
            blue.fill();
        }

    }
}
