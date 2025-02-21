package org.example;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm phần tử vào danh sách
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Thêm phần tử vào chỉ số cụ thể
        list.add(1, "Orange");

        // In kích thước danh sách
        System.out.println("Size: " + list.size());

        // Kiểm tra phần tử
        System.out.println("Contains Banana: " + list.contains("Banana"));
        System.out.println("Index of Cherry: " + list.indexOf("Cherry"));

        // Lấy phần tử tại chỉ số
        System.out.println("Element at index 1: " + list.get(1));

        // Xóa phần tử
        list.remove(1); // Xóa "Orange"
        System.out.println("Size after removal: " + list.size());

        // In tất cả phần tử
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Xóa tất cả phần tử
        list.clear();
        System.out.println("Size after clear: " + list.size());

        // Sao chép danh sách
        MyList<String> clonedList = (MyList<String>) list.clone();
        System.out.println("Cloned list size: " + clonedList.size());
    }
}