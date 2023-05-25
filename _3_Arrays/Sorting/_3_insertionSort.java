package _3_Arrays.Sorting;

import java.util.Scanner;

public class _3_insertionSort {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 7, 9 };

        // insertion sort
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i + 1;
            for (int j = k; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
