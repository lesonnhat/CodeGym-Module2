package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Thêm phần tử
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.addFirst("Rabbit"); // Thêm vào đầu danh sách

        // Lấy phần tử
        System.out.println(linkedList.get(1)); // In ra: Dog

        // Xóa phần tử
        linkedList.removeLast(); // Xóa "Cat"

//         Kích thước danh sách
        System.out.println(linkedList.size()); // In ra: 2
    }
}