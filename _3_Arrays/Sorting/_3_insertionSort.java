package _3_Arrays.Sorting;

import java.util.Scanner;

public class _3_insertionSort {
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int k = i;
            for (int j = i + 1; j > 0; j--) {
                if (arr[k] > arr[j]) {
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
                k--;
                // printArray(arr);
            }
        }
        printArray(arr);
    }
}
