package org.example;

public class BinarySearch {
//    public static int binarySearch(int[] arr, int key) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (arr[mid] == key) {
//                return mid; // Trả về chỉ số của phần tử
//            } else if (arr[mid] < key) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return -1; // Không tìm thấy
//    }
//
//    public static void main(String[] args) {
//        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 90, 100, 190};
//        int key = 30;
//
//        int result = binarySearch(sortedNumbers, key);
//        if (result != -1) {
//            System.out.println("Phần tử " + key + " được tìm thấy tại chỉ số: " + result);
//        } else {
//            System.out.println("Phần tử không được tìm thấy.");
//        }
//    }

    // Sử dụng đệ quy
    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1; // Không tìm thấy
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == key) {
            return mid; // Trả về chỉ số của phần tử
        } else if (arr[mid] > key) {
            return binarySearch(arr, left, mid - 1, key); // Tìm kiếm trong nửa bên trái
        } else {
            return binarySearch(arr, mid + 1, right, key); // Tìm kiếm trong nửa bên phải
        }
    }

    public static void main(String[] args) {
        int[] sortedNumbers = {10, 20, 30, 40, 50};
        int key = 30;

        int result = binarySearch(sortedNumbers, 0, sortedNumbers.length - 1, key);
        if (result != -1) {
            System.out.println("Phần tử " + key + " được tìm thấy tại chỉ số: " + result);
        } else {
            System.out.println("Phần tử không được tìm thấy.");
        }
    }
}