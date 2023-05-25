package _3_Arrays.Sorting;

import java.util.Scanner;

public class _1_selectionSort {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 7, 9 };

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = arr[i];
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = smallest;
            arr[idx] = temp;
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
