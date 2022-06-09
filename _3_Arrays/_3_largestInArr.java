package _3_Arrays;

import java.util.Scanner;

public class _3_largestInArr {
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
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        printArray(arr);
        System.out.println("largest: " + largest);
    }

}
