package com.example.demo.design.abstractFactory;

import com.example.demo.design.abstractFactory.factory.Color;
import com.example.demo.design.abstractFactory.factory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
