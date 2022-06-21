package _5_2DArrays;

import java.util.Scanner;

public class _5_pascalsTraingle {
    public static void generate(int numRows) {
        int[][] result = new int[numRows][];
        if (numRows == 1) {
            result[0] = new int[1];
            result[0][0] = 1;
            System.out.println("1");
            return;
        }
        for (int i = 0; i < numRows; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        generate(9);
    }
}



