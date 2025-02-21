package com.codegym;

public class Square extends Rectangle implements Colorable {
    public Square(double side) {
        super(side, side); // Gọi constructor của Rectangle
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}