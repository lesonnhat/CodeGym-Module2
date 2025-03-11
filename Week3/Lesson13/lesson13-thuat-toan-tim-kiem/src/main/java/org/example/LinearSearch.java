package org.example;

public class LinearSearch {
//    public static int linearSearch(int[] arr, int key) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key) {
//                return i; // Trả về chỉ số của phần tử
//            }
//        }
//        return -1; // Không tìm thấy
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {10, 20, 30, 40, 50};
//        int key = 30;
//
//        int result = linearSearch(numbers, key);
//        if (result != -1) {
//            System.out.println("Phần tử " + key + " được tìm thấy tại chỉ số: " + result);
//        } else {
//            System.out.println("Phần tử không được tìm thấy.");
//        }
//    }

    public static void linearSearch(int[] arr, int key) {
        String result = "Không tìm thấy " + key;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                result = "Tìm thấy " + key + " ở vị trí " + i;
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearSearch(arr, 10);
    }
}