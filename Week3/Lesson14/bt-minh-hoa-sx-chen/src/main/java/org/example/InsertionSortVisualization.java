package org.example;

import java.util.Arrays;

public class InsertionSortVisualization {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key sang bên phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            // Hiển thị trạng thái mảng sau mỗi lần chèn
            System.out.println("Sau khi chèn phần tử " + key + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}