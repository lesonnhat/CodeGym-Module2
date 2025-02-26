package org.example;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                index = mid;
                break;
            }
            else if (array[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 11));
        System.out.println(binarySearch(arr, 79));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 80));
    }
}
