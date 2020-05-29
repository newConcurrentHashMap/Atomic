package com.example.demo.design.abstractFactory;

import com.example.demo.design.abstractFactory.factory.ColorFactory;
import com.example.demo.design.abstractFactory.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if ("SHAPE".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
