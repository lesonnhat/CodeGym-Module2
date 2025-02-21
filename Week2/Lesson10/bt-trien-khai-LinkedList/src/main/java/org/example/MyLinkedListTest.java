package org.example;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        // Thêm các phần tử vào danh sách
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.printList(); // In danh sách

        // Thêm phần tử đầu tiên
        list.addFirst("Orange");
        list.printList(); // In danh sách

        // Thêm phần tử cuối cùng
        list.addLast("Grapes");
        list.printList(); // In danh sách

        // Xóa phần tử tại vị trí 1
        list.remove(1);
        list.printList(); // In danh sách

        // Xóa phần tử "Grapes"
        list.remove("Grapes");
        list.printList(); // In danh sách

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("Contains Banana: " + list.contains("Banana"));

        // Lấy phần tử tại vị trí 1
        System.out.println("Element at index 1: " + list.get(1));

        // Kích thước danh sách
        System.out.println("Size: " + list.size());

        // Sao chép danh sách
        MyLinkedList<String> clonedList = list.clone();
        clonedList.printList(); // In danh sách sao chép
    }
}