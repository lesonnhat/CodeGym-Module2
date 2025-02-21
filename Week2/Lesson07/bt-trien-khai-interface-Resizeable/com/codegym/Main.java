package com.codegym;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random random = new Random();
        for (Resizeable shape : shapes) {
            double percent = random.nextDouble() * 100; // Tỷ lệ ngẫu nhiên từ 0-100
            System.out.println("Before resizing: " + shape);
            shape.resize(percent);
            System.out.println("After resizing by " + percent + "%: " + shape);
            System.out.println();
        }
    }
}