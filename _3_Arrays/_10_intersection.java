package _3_Arrays;

import java.util.Scanner;

public class _10_intersection {
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
        int arr1[] = takeInput();
        int size1 = arr1.length;
        int arr2[] = takeInput();
        int size2 = arr2.length;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }

    }

}
