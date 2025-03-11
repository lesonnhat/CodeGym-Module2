//package org.example;
//
//class Shape {
//    public String type;
//
//    public Shape(String type) {
//        this.type = type;
//    }
//}
//
//class AreaCalculator {
//    public double calculateArea(Shape shape) {
//        if (shape.type.equals("Circle")) {
//            return Math.PI * Math.pow(5, 2); // Giả sử bán kính là 5
//        } else if (shape.type.equals("Square")) {
//            return 5 * 5; // Giả sử cạnh là 5
//        }
//        return 0;
//    }
//}
//
//// Lớp chính để chạy ví dụ
//public class Main {
//    public static void main(String[] args) {
//        Shape circle = new Shape("Circle");
//        Shape square = new Shape("Square");
//
//        AreaCalculator calculator = new AreaCalculator();
//        System.out.println("Circle area: " + calculator.calculateArea(circle)); // In ra diện tích hình tròn
//        System.out.println("Square area: " + calculator.calculateArea(square)); // In ra diện tích hình vuông
//    }
//}