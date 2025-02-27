package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 12, 6, 5, -4};
        System.out.println("Array: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Array sau sắp xếp: " + Arrays.toString(arr));
    }
}
