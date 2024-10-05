package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void SelSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {45, 43, 54, 23, 48, 87, 56,4, 8, 9};
        SelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
