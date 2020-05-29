package com.example.demo.design.abstractFactory.factory;

import com.example.demo.design.abstractFactory.AbstractFactory;

public class ColorFactory extends AbstractFactory {


    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if ("RED".equalsIgnoreCase(colorType)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(colorType)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(colorType)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
