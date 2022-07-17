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
        int arr2D[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // todo later
        for (int i = 0; i < 1; i++) {
            int rowlength = i;
            int collength = i;
            while (collength < 4) {
                System.out.print(arr2D[rowlength][collength] + " ");
                collength++; // 5
            }
            while (rowlength < 3) {
                System.out.print(arr2D[rowlength + 1][collength - 1] + " ");
                rowlength++;// 3
            }
            while (collength - 1 > 0) {
                System.out.print(arr2D[rowlength][collength - 2] + " ");
                collength--;//1
            }
            // System.out.println(collength);
            while (rowlength-1> 0) {
                System.out.print(arr2D[rowlength-1][collength - 1] + " ");
                rowlength--;//1
            }
            // System.out.println(rowlength);
        }

    }
}
