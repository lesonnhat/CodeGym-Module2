package org.example;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Di chuyển các phần tử lớn hơn key về phía trước
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Chèn key vào vị trí đúng
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}