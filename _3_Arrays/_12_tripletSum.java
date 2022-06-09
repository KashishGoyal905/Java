package _3_Arrays;

import java.util.Scanner;

public class _12_tripletSum {
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
        int x = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
