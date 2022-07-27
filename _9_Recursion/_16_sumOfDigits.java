package _9_Recursion;

import java.util.Scanner;

public class _16_sumOfDigits {
    public static int sum(int m) {
        if (m == 0) {
            return 0;
        }
        return m % 10 + sum(m / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int ans = sum(m);
        System.out.println(ans);
    }
}
