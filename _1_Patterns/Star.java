package _1_Patterns;

import java.util.Scanner;

public class Star {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("->");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.print("*" + " ");
            }
            for (int j = n; j < n + i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
