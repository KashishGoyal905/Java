package _3_Arrays.General;

import java.util.Scanner;

public class _5_LinearSearch {
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int size = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the no. to find in the array");
        int toFind = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == toFind) {
                System.out.println("index is: " + i);
            }
        }
    }
}
