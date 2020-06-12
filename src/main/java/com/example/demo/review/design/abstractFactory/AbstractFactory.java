package com.example.demo.review.design.abstractFactory;

import com.example.demo.review.design.abstractFactory.factory.Color;
import com.example.demo.review.design.abstractFactory.factory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
