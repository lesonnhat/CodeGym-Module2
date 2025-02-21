package com.codegym;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(15);
        shapes[1] = new Rectangle(9, 12);
        shapes[2] = new Square(11);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
