package _3_Arrays.Sorting;

import java.util.Scanner;

public class _1_selectionSort {
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
        int count = -1;
        for (int i = 0; i < size-1; i++) {
            int smallest = arr[i];
            for (int j = i; j < size; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    count = j;
                }
            }
            int temp = arr[i]; 
            arr[i] = smallest;
            arr[count] = temp;
        }
        printArray(arr);
    }
}
