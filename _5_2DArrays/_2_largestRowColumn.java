package _5_2DArrays;

import java.util.Scanner;

public class _2_largestRowColumn {
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

    public static void printArray(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int arr2D[][] = takeInput(rows, cols);
        int maxRowSum = 0;
        int rowIndex = -1;
        int maxColSum = 0;
        int colIndex = -1;
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr2D[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                rowIndex = i;
            }
        }
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr2D[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                colIndex = j;
            }
        }
        if (maxRowSum > maxColSum) {
            System.out.println("Row: " + rowIndex + " " + maxRowSum);
        } else {
            System.out.println("Col: " + colIndex + " " + maxColSum);
        }

    }
}
