package org.example;

// Factory để tạo các hình dạng
abstract class ShapeFactory {
    abstract Shape getShape(String shapeType);
}