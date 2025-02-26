package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));

        int value = 9;

        int index = binarySearch(arr, 0, n - 1, value);
        if (index == -1) {
            System.out.println("Không tìm thấy " + value + " trong mảng");
        } else {
            System.out.println("Tìm thấy " + value + " ở vị trí " + index + " trong mảng");
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
