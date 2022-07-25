package _9_Recursion;

import java.util.Scanner;

public class _5_countDigits {
    public static int counter(int n) {
        if (n == 0) {
            return 0;
        }
        return counter(n / 10) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("1");
            return;
        }
        int count = counter(n);
        System.out.println("count: " + count);
    }
}
