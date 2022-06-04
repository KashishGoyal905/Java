package Patterns;

import java.util.Scanner;

public class Daimond {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = n / 2;
        int k = z + 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                System.out.print("->");
            }
            for (int j = k - i - 1; j < k; j++) {
                System.out.print("*" + " ");
            }
            for (int j = k; j < k + i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        // System.out.println(k);

        int val = 1;
        for (int i = k; i < n; i++) {
            for (int j = 0; j < val; j++) {
                System.out.print("->");
            }
            val++;
            for (int j = val - 1; j < k; j++) {
                System.out.print("*" + " ");
            }
            for (int j = k; j < k ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
