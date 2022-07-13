package _8_classQnA;

import java.util.Arrays;
import java.util.Scanner;

public class _2_UnionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int i = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int largest = Math.max(n1, n2);
        while (i < n1) {
            if (i < n2 && arr1[i] == arr2[i]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                if (i < n2) {
                    System.out.print(arr1[i] + " " + arr2[i] + " ");
                    i++;
                }
                i++;
            }
        }
        if (n1 > n2) {
            i = i - 1;
            while (i < largest) {
                System.out.println(arr1[i] + " ");
                i++;
            }
        } else {
            while (i < largest) {
                System.out.println(arr2[i] + " ");
                i++;
            }
        }
    }
}
