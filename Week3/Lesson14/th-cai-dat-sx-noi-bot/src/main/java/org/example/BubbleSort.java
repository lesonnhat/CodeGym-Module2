package org.example;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("Array: " + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Array sau khi sắp xếp: " + Arrays.toString(arr));
    }
}