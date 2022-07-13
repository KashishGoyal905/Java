package _8_classQnA;

import java.util.Scanner;

public class _1_avgArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int largest3 = arr[arr.length - 1];
        int largest2 = arr[arr.length - 2];
        int largest1 = arr[arr.length - 3];
        int avg = (largest3 + largest2 + largest1) / 3;
        System.out.println(avg);
    }
}
