package _3_Arrays.Sorting;

import java.util.Scanner;

public class _2_bubbleSort {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 7, 9 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
