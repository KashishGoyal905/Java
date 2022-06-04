package Patterns;

import java.util.Scanner;

public class Isosceles {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = 1;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("->");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.print(value + " ");
                value++;
            }
            for (int j = n; j < n + i; j++) {
                System.out.print(value-2 + " ");
                value--;
            }
            System.out.println(" ");
        }
    }
}
