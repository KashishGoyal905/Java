package _1_Patterns;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n1;
        int n2;
        if (size % 2 == 0) {
            n2 = size / 2;
            n1 = size / 2;
        } else {
            n1 = (size / 2) + 1;
            n2 = size - n1;
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n2 - i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 0; j <n2-i-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

}
