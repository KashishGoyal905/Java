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
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int arr2D[][] = takeInput(rows, cols);
        // todo later 
    }
}
