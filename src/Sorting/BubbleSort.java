package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void BS (int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 43, 54, 23, 48, 87, 56,4, 8, 9};
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }
}
