package _5_2DArrays;

import java.util.Scanner;

public class _4_spiralPrint {
    public static int[][] takeInput(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int rows = scanner.nextInt();
        // int cols = scanner.nextInt();
        // int arr2D[][] = takeInput(rows, cols);
        int arr2D[][] = { { 1, 2, 3, 4, 5 },
                { 16, 17, 18, 19, 6 },
                { 15, 24, 25, 20, 7 },
                { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };
        // todo later
        int rowlength = 0;
        int collength = 0;
        int size = 5;
        int size2 = 5;
        for (int i = 0; i < size; i++) {
            while (collength < size - i) {
                System.out.print(arr2D[rowlength][collength] + " ");
                collength++; // 5 3
            }
            while (rowlength < size - i - 1) {
                System.out.print(arr2D[rowlength + 1][collength - 1] + " ");
                rowlength++;// 3
            }
            while (collength - 1 - i > 0) {
                System.out.print(arr2D[rowlength][collength - 2] + " ");
                collength--;// 1
            }
            // System.out.println(collength);
            while (rowlength - 1 - i > 0) {
                System.out.print(arr2D[rowlength - 1][collength - 1] + " ");
                rowlength--;// 1
            }
            // System.out.println(rowlength);
        }

    }
}
