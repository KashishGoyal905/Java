package _5_2DArrays;

import java.util.Scanner;

public class _3_wavePrint {
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
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int arr2D[][] = takeInput(rows, cols);
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr2D[i][j] + " ");
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(arr2D[i][j] + " ");
                }
            }
        }
    }
}
