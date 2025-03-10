package org.example;

// Lớp chính để chạy chương trình
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ConcreteShapeFactory();

        // Tạo hình tròn
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw(); // In ra: Drawing a Circle

        // Tạo hình vuông
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw(); // In ra: Drawing a Square

        // Tạo hình chữ nhật
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw(); // In ra: Drawing a Rectangle
    }
}