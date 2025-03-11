package org.example;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Cập nhật chỉ số của phần tử nhỏ nhất
                }
            }
            // Hoán đổi arr[i] và arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}