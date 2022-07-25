package _9_Recursion;

import java.util.Scanner;

public class _1_factorial {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorialAns = factorial(n);
        System.out.println(fatorialAns);
    }
}
