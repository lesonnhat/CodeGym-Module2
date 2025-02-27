package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 1, 4, 7 };
        System.out.println("Array: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Array sau sắp xếp: " + Arrays.toString(array));
    }
}
