package org.example;

// Giao diện Shape
interface Shape {
    double calculateArea();
}

// Lớp cụ thể - Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Lớp cụ thể - Square
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

// Lớp cụ thể - Triangle
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Lớp tính diện tích
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

// Sử dụng
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 10);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Square area: " + calculator.calculateArea(square));
        System.out.println("Triangle area: " + calculator.calculateArea(triangle));
    }
}