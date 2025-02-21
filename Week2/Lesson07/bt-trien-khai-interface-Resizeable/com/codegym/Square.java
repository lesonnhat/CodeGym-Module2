package com.codegym;

public class Square extends Rectangle implements Resizeable {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square with side: " + super.getWidth() + ", area: " + getArea();
    }
}