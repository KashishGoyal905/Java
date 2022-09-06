package _9_Recursion;

import java.util.Scanner;

public class _11_allOccurence {

    public static void allOccurence(int[] array, int x, int start) {
        // if (start >= array.length - 1) {
        // if (array[start] == x) {
        // System.out.println(start + " ");
        // } else {
        // return;
        // }
        // }
        if (start > array.length - 1) {
            return;
        }
        if (array[start] == x) {
            System.out.print(start + " ");
        }
        allOccurence(array, x, start + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        allOccurence(array, x, 0);
    }
}
