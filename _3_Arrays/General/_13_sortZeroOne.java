package _3_Arrays.General;

import java.util.Scanner;

public class _13_sortZeroOne {
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
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                if (arr[i] == 1) {
                    for (int j = i + 1; j < size; j++) {
                        if (arr[j] == 0) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }
        printArray(arr);
    }
}
