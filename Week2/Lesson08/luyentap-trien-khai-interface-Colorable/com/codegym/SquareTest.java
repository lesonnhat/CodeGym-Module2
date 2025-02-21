package com.codegym;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(5);
        System.out.println(square2);

        Square square3 = new Square(17, "yellow", true);
        System.out.println(square3);
        square3.howToColor();
    }
}
