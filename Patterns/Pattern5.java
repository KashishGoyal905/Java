package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
        int k = i+1;
            for (int j = 1; j < n - i; j++) {
                System.out.print("->");
            }
            for (int j = n - i; j <= n; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");

        }
    }
}
